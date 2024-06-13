# Copyright (c) 2024 Koninklijke Philips N.V.
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Philips Ocean Image to validate pacific machines. \
This image contains everything used to test philips machines including GUI, \
demos and lots of applications. This creates a very large image, not \
suitable for production."
LICENSE = "MIT"

inherit core-image

## Select Image Features
IMAGE_FEATURES += " \
    debug-tweaks \
    tools-profile \
    nfs-server \
    tools-debug \
    ssh-server-openssh \
    hwcodecs \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'weston', \
       bb.utils.contains('DISTRO_FEATURES',     'x11', 'x11-base x11-sato', \
                                                       '', d), d)} \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-full-cmdline \
    packagegroup-tools-bluetooth \
    packagegroup-fsl-tools-audio \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    packagegroup-fsl-tools-testapps \
    packagegroup-imx-security \
    packagegroup-fsl-gstreamer1.0 \
    packagegroup-fsl-gstreamer1.0-full \
    firmwared \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'weston-xwayland xterm', '', d)} \
"

###########################customized package for target ocean images ############
CORE_IMAGE_EXTRA_INSTALL += "chromium-ozone-wayland"

IMAGE_INSTALL += "tslib"
IMAGE_INSTALL += "busybox"
IMAGE_INSTALL += "pixman"
IMAGE_INSTALL += "util-linux-libuuid"
IMAGE_INSTALL += "libnl"
IMAGE_INSTALL += "libedit"
IMAGE_INSTALL += "libffi"
IMAGE_INSTALL += "fontconfig"
IMAGE_INSTALL += "boost"
IMAGE_INSTALL += "protobuf"
IMAGE_INSTALL += "libxml2"
IMAGE_INSTALL += "zlib"
IMAGE_INSTALL += "libpng"
IMAGE_INSTALL += "freetype"
IMAGE_INSTALL += "cairo"
IMAGE_INSTALL += "openssl"
IMAGE_INSTALL += "libdrm"

#########tools only#####
IMAGE_INSTALL += "\
		netcat \
		ethtool \
		wireless-tools \
		ocean-hwclock \
"
######## those packges installed only for wifi/bt##########
# delete summit-networkmanager-60 summit-networkmanager-60-nmcli #
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
"

### ocean-core package install ###
IMAGE_INSTALL += "fltk"