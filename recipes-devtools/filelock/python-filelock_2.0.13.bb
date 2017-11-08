SUMMARY = "A flexible framework of neural networks"
HOMEPAGE = "https://chainer.org/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=182d61171c68865ce5e166f49552858e"

SRC_URI[md5sum] = "f4b8ab5c92bb145c888d042b7c0878d1"
SRC_URI[sha256sum] = "d05079e7d7cae7576e192749d3461999ca6b0843d35b0f79f1fa956b0f6fc7d8"

PYPI_PACKAGE = "filelock"
inherit pypi setuptools

FILES_${PN} += "${datadir}/filelock"

BBCLASSEXTEND = "nativesdk"
RDEPENDS_${PN} = "\
               python-distutils \
"