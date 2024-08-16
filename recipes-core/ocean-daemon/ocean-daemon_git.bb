# Copyright (c) 2024 Koninklijke Philips N.V.
# Released under the MIT license (see COPYING.MIT for the terms)
#
# SPDX-License-Identifier: MIT
#

SUMMARY = "Ocean Daemon SW Project"
DESCRIPTION = "Ocean Daemon SW Project"
LICENSE = "CLOSED"

SRC_URI = "git://tfsemea1.ta.philips.com:22/tfs/TPC_Region14/MA%20PM%20Shenzhen%20RnD/_git/demon-hunter;protocol=ssh;branch=${SRCBRANCH}"
SRCBRANCH = "master"
SRCREV = "a0bc2ce0fa6425d163b43b0691717759f2800929" 
S = "${WORKDIR}/git"

inherit cmake
