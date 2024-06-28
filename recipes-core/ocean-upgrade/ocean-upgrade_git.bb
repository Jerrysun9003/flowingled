# Copyright (c) 2024 Koninklijke Philips N.V.
# Released under the MIT license (see COPYING.MIT for the terms)
#
# SPDX-License-Identifier: MIT
#

SUMMARY = "Ocean Power Upgrade SW Project"
DESCRIPTION = "Ocean Power Upgrade SW Project"
LICENSE = "CLOSED"

SRC_URI = "git://tfsemea1.ta.philips.com/tfs/TPC_Region14/MA%20PM%20Shenzhen%20RnD/_git/ocean-upgrade;protocol=ssh;branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "146161ba6498a7a0efb43e30d43a2975a02393b2" 
S = "${WORKDIR}/git"

inherit cmake

INHIBIT_PACKAGE_STRIP = "1"
