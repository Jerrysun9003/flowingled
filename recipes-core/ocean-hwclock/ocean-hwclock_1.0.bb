# Copyright (c) 2024 Koninklijke Philips N.V.
# Released under the MIT license (see COPYING.MIT for the terms)
#
# SPDX-License-Identifier: MIT
#

SUMMARY = "Ocean Power MCU RTC Clock Project"
DESCRIPTION = "Ocean Power MCU RTC Clock Project"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/philips-internal/ocean-utils-hwclock.git;protocol=ssh;branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "cfc6756b12285d1deb8cd428adcd6204f6430d16" 
S = "${WORKDIR}/git"

inherit cmake

do_install() {
    install -d ${D}${bindir}
    install -Dm 755 ${B}/src/ocean-hwclock ${D}${bindir}/
}

# point to /usr/bin/ folder
FILES:${PN} += "${bindir}/*"
