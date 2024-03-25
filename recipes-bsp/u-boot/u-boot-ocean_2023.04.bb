# Copyright (c) 2024 Koninklijke Philips N.V.

require recipes-bsp/u-boot/u-boot-imx_${PV}.bb

COMPATIBLE_MACHINE = "(imx8mp-lpddr4-ocean)"

UBOOT_SRC = "git://tfsemea1.ta.philips.com/tfs/TPC_Region14/MA%20PM%20Shenzhen%20RnD/_git/u-boot;protocol=ssh"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "philips-ocean/ep1"
LOCALVERSION = "-ocean-2024-03-20"
SRCREV = "c8e03785e3ee54532d25505245a6f555980d7daf"
