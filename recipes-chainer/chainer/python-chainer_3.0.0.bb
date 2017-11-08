SUMMARY = "A flexible framework of neural networks"
HOMEPAGE = "https://chainer.org/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=dc5707ff25304d9e30f42c5b0adb9879"

SRC_URI[md5sum] = "ce62fb39d18958f5d6b4f8f3c1e744b0"
SRC_URI[sha256sum] = "4fd6cd4cfb30085e9fe4d9f3923485761ad94ae35e55f674562d654812b5f861"

PYPI_PACKAGE = "chainer"
inherit pypi setuptools

FILES_${PN} += "${datadir}/chainer"

BBCLASSEXTEND = "nativesdk"
RDEPENDS_${PN} = "\
               python-numpy \
               python-filelock \
               python-six \
               python-setuptools \
               python-multiprocessing \
               python-json \
               python-argparse \
"