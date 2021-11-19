package com.uisrael.tiendaMoviles.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

public class rutaJSF {
	public static String guardarBlobEnFicheroTemporal(byte[] bytes, String nombreArchivo) {
		String ubicacionImagen = null;
		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext()
				.getContext();
		String path = servletContext.getRealPath("") + File.separatorChar + "resources" + File.separatorChar + "img"
				+ File.separatorChar + "tmp" + File.separatorChar + nombreArchivo;

		File f = null;
		InputStream in = null;
		try {
			f = new File(path);
			in = new ByteArrayInputStream(bytes);
			FileOutputStream out = new FileOutputStream(f.getAbsolutePath());

			int c = 0;
			while ((c = in.read()) >= 0) {
				out.write(c);
			}
			out.flush();
			out.close();
			ubicacionImagen = "../../resources/img/tmp/" + nombreArchivo;
		} catch (Exception e) {
			System.err.println("No se pudo cargar la imagen");
		}

		return ubicacionImagen;
	}

}
