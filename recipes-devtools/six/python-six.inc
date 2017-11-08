SUMMARY = "Python 2 and 3 compatibility library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=35cec5bf04dd0820d0a18533ea7c774a"

SRC_URI[md5sum] = "d12789f9baf7e9fb2524c0c64f1773f8"
SRC_URI[sha256sum] = "70e8a77beed4562e7f14fe23a786b54f6296e34344c23bc42f07b15018ff98e9"

do_compile_append() {
    export BUILD_SYS=${BUILD_SYS} HOST_SYS=${HOST_SYS}
    ${PYTHON} setup.py -q bdist_egg --dist-dir ./
}
do_install_append() {
    install -m 0644 ${S}/*.egg ${D}/${PYTHON_SITEPACKAGES_DIR}/
}

RDEPENDS_${PN} += "python-io"
