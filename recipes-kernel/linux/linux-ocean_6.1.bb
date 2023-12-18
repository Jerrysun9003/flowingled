# Copyright 2023 Philips
# Released under the MIT license (see COPYING.MIT for the terms)
#
# SPDX-License-Identifier: MIT
#

SUMMARY = "Linux Kernel provided and supported by Philips"
DESCRIPTION = "Linux Kernel provided and supported by Phlips with focus on \
Ocean Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx_6.1.bb

SRC_URI = "${KERNEL_SRC}"
KERNEL_SRC = "git://tfsemea1.ta.philips.com/tfs/TPC_Region14/MA%20PM%20Shenzhen%20RnD/_git/linux;protocol=ssh;branch=${SRCBRANCH}"
KBRANCH = "${SRCBRANCH}"
SRCBRANCH = "philips-ocean/ep1"
LOCALVERSION = "-ocean"
SRCREV = "04b05c5527e9af8d81254638c307df07dc9a5dd3"

# PV is defined in the base in linux-imx.inc file and uses the LINUX_VERSION definition
# required by kernel-yocto.bbclass.
#
# LINUX_VERSION define should match to the kernel version referenced by SRC_URI and
# should be updated once patchlevel is merged.
LINUX_VERSION = "6.1.36"
PV = "${LINUX_VERSION}"
