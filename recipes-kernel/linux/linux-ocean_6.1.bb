# Copyright (c) 2024 Koninklijke Philips N.V.
# Released under the MIT license (see COPYING.MIT for the terms)
#
# SPDX-License-Identifier: MIT
#

SUMMARY = "Linux Kernel provided and supported by Philips"
DESCRIPTION = "Linux Kernel provided and supported by Phlips with focus on \
Ocean Boards. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx_6.1.bb

KBUILD_DEFCONFIG:mx8mp-nxp-bsp = "imx_ocean_defconfig"

SRC_URI = "${KERNEL_SRC}"
KERNEL_SRC = "git://tfsemea1.ta.philips.com/tfs/TPC_Region14/MA%20PM%20Shenzhen%20RnD/_git/linux;protocol=ssh;branch=${SRCBRANCH}"
KBRANCH = "${SRCBRANCH}"
SRCBRANCH = "philips-ocean/ep1"
LOCALVERSION = "-ocean-2024-03-20"
SRCREV = "e3b765d474b34e9d7e5088685f9e79fd83167834"

# PV is defined in the base in linux-imx.inc file and uses the LINUX_VERSION definition
# required by kernel-yocto.bbclass.
#
# LINUX_VERSION define should match to the kernel version referenced by SRC_URI and
# should be updated once patchlevel is merged.
LINUX_VERSION = "6.1.36"
PV = "${LINUX_VERSION}"
