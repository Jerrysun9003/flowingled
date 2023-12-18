# Copyright 2023-2024 Philips Ocean

require recipes-bsp/u-boot/u-boot-imx_2023.04.bb

UBOOT_SRC ?= "git://tfsemea1.ta.philips.com/tfs/TPC_Region14/MA%20PM%20Shenzhen%20RnD/_git/u-boot;protocol=ssh"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCBRANCH = "philips-ocean/ep1"
LOCALVERSION = "-ocean"
SRCREV = "1e5b6c6bf246a38654d07e7e23f333ad0e7d42d0"
