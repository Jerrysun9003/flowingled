FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://initui.service"

do_install:append () {
    # if running in ocean machine to create initial condition for UI
    if [ "${@bb.utils.contains('MACHINE', 'imx8mp-lpddr4-ocean','true', 'false', d)}" ]; then
        install -Dm 0644 ${WORKDIR}/initui.service ${D}${sysconfdir}/systemd/
    fi
}
