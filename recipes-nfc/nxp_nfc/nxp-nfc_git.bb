# Copyright (C) 2016 NXP Semiconductors

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


