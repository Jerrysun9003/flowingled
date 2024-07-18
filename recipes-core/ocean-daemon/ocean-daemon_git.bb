# Copyright (c) 2024 Koninklijke Philips N.V.
# Released under the MIT license (see COPYING.MIT for the terms)
#
# SPDX-License-Identifier: MIT
#

SUMMARY = "Ocean Daemon SW Project"
DESCRIPTION = "Ocean Daemon SW Project"
LICENSE = "CLOSED"

SRC_URI = "git://tfsemea1.ta.philips.com:22/tfs/TPC_Region14/MA%20PM%20Shenzhen%20RnD/_git/application-management-daemon;protocol=ssh;branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "8b94341310b299589c02f0dafb86e5164c4d5038" 
S = "${WORKDIR}/git"

inherit cmake
