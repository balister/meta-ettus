DESCRIPTION = "A console-only image with a development/debug \
environment (suitable for building UHD) installed."

IMAGE_FEATURES += "splash ssh-server-openssh tools-sdk \
                   tools-debug tools-profile debug-tweaks \
                   dev-pkgs dbg-pkgs \
                  "

EXTRA_IMAGE_FEATURES += "package-management"

LICENSE = "MIT"

TOOLCHAIN_HOST_TASK_append = " nativesdk-python-cheetah \
    nativesdk-python-netserver nativesdk-python-pprint \
    nativesdk-python-pickle nativesdk-python-shell \
    nativesdk-orc nativesdk-swig"

CORE_IMAGE_EXTRA_INSTALL = "\
    alsa-utils \
    i2c-tools \
    screen \
    vim \
    vim-vimrc \
    git \
    boost \
    cmake \
    python \
    python-cheetah \
    python-modules \
    python-argparse \
    htop \
    sshfs-fuse \
    glib-2.0 \
    orc \
    libudev \
    ntpdate \
    iperf \
    openssh-sftp \
    openssh-sftp-server \
    "

inherit core-image
