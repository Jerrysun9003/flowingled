# Copyright (c) 2024 Koninklijke Philips N.V.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "This is the basic core image with minimal tests for philip machines"
LICENSE = "MIT"

require recipes-fsl/images/imx-image-core.bb

###########################install 64 lib package ############
CORE_IMAGE_EXTRA_INSTALL += "chromium-ozone-wayland"

IMAGE_INSTALL += "tslib"
IMAGE_INSTALL += "busybox"
IMAGE_INSTALL += "protobuf"
IMAGE_INSTALL += "openssl"

#########tools only#####
IMAGE_INSTALL += "\
		netcat \
		ethtool \
		wireless-tools \
"
######## those packges installed only for wifi/bt##########
IMAGE_INSTALL += "\
		iperf3 \
		tcpdump \
		iw \
		60-radio-firmware-sdio-uart \
		adaptive-ww \
		kernel-module-60-backports \
		bt-uart-scripts	\
		summit-supplicant-60 \
		summit-supplicant-libs-60 \
		summit-networkmanager-60 \
		summit-networkmanager-60-nmcli \
"
