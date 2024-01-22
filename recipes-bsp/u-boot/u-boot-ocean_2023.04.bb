# Copyright (c) 2024 Koninklijke Philips N.V.

require recipes-bsp/u-boot/u-boot-imx_${PV}.bb

COMPATIBLE_MACHINE = "(imx8mp-lpddr4-ocean)"

UBOOT_SRC = "git://tfsemea1.ta.philips.com/tfs/TPC_Region14/MA%20PM%20Shenzhen%20RnD/_git/u-boot;protocol=ssh"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "philips-ocean/ep1"
LOCALVERSION = "-ocean-2024-01-29"
SRCREV = "8ae2ef35ff6ef64369db3a827bfb544d2c7f0ef6"
