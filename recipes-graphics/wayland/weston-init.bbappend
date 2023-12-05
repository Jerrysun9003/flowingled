FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://profile"

do_install:append() {
    if [ "${@bb.utils.filter('DISTROOVERRIDES', 'ocean', d)}" != "" ]; then
        install -Dm0755 ${WORKDIR}/profile ${D}${sysconfdir}/profile.d/weston.sh
    fi
}
