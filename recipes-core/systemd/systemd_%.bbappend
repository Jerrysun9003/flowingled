FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://ecg_freescale.service \
            file://nats-service.service \
            file://ut5000.service \
            file://initui.service \
            file://ocean-hwclock.service \
            file://udhcpd.service \
            file://udhcpd.conf \
"

DEPENDS += "dos2unix-native"

do_install:append () {
    # if running in ocean machine to create initial condition for UI
    if [ "${@bb.utils.contains('MACHINE', 'imx8mp-lpddr4-ocean','true', 'false', d)}" ]; then
        install -Dm 0644 ${WORKDIR}/ecg_freescale.service ${D}${sysconfdir}/systemd/system/
        install -Dm 0644 ${WORKDIR}/nats-service.service ${D}${sysconfdir}/systemd/system/
        install -Dm 0644 ${WORKDIR}/ut5000.service ${D}${sysconfdir}/systemd/system/
        install -Dm 0644 ${WORKDIR}/initui.service ${D}${sysconfdir}/systemd/system/
        install -Dm 0644 ${WORKDIR}/ocean-hwclock.service ${D}${sysconfdir}/systemd/system/
        # config dhcp server
        install -Dm 0644 ${WORKDIR}/udhcpd.service ${D}${sysconfdir}/systemd/system/
        dos2unix ${WORKDIR}/udhcpd.conf
        install -Dm 0644 ${WORKDIR}/udhcpd.conf ${D}${sysconfdir}/
        # create dhcp lease file
        install -d ${D}/var/lib/misc/
        touch ${D}/var/lib/misc/udhcpd.leases
        chmod 0600 ${D}/var/lib/misc/udhcpd.leases
    fi
}

FILES:${PN} += "${sysconfdir}/udhcpd.conf \
                 /var/lib/misc/udhcpd.leases \
"