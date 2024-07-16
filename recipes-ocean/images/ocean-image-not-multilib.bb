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
    packagegroup-fsl-tools-audio \
    packagegroup-fsl-tools-gpu \
    packagegroup-fsl-tools-gpu-external \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11 wayland', 'weston-xwayland xterm', '', d)} \
"
# this variable defautly created by conf/local.conf env variable, better remove manually
EXTRA_IMAGE_FEATURES:remove = "debug-tweaks package-management"

###########################customized package for target ocean images ############
CORE_IMAGE_EXTRA_INSTALL += "chromium-ozone-wayland"

### ocean-core package install ###
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
IMAGE_INSTALL += "libpng"
IMAGE_INSTALL += "freetype"
IMAGE_INSTALL += "cairo"
IMAGE_INSTALL += "openssl"
IMAGE_INSTALL += "libdrm"

###tools only, consider to remove at the end###
IMAGE_INSTALL += "\
		gptfdisk \
		i2c-tools \
		netcat \
		ethtool \
		wireless-tools \
"
### those packges installed only for wifi/bt ###
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

### for ocean programs ###
IMAGE_INSTALL += "ocean-ui"
IMAGE_INSTALL += "ocean-upgrade"
IMAGE_INSTALL += "ocean-daemon"
IMAGE_INSTALL += "ocean-hwclock"
