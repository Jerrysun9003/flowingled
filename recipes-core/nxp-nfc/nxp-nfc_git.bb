# Copyright (c) 2024 Koninklijke Philips N.V.

DESCRIPTION = "Linux NFC stack for NCI based NXP NFC Controllers."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/include/linux_nfc_api.h;md5=0a45e480f6d1b3df6ca6994772ddfe28"

SRC_URI = " \
    git://github.com/NXPNFCLinux/linux_libnfc-nci.git;branch=NCI2.0_PN7160 \
    file://pacific_nfc.patch \
"
SRCREV = "212b5d7c82c914b5ac22f5dc1438503856f476ef"

inherit autotools pkgconfig

S = "${WORKDIR}/git"

do_install:append() {
    if [ -d "${D}/usr/sbin" ]; then
        install -d ${D}/unit_tests
        install -d ${D}/unit_tests/NFC
        install -Dm 755 ${D}/usr/sbin/nfcDemoApp ${D}/unit_tests/NFC/
        rm -rf "${D}/usr/sbin"
    fi

    if [ -d "${D}/etc" ]; then
        install -d ${D}/usr/local
        install -d ${D}/usr/local/etc
        install -Dm 755 ${D}/etc/* ${D}/usr/local/etc/
        rm -rf "${D}/etc"
    fi
}

FILES:${PN} = "/unit_tests/NFC/* \
                /usr/local/etc/* \
                ${bindir}/* \
                ${libdir}/* \
"
