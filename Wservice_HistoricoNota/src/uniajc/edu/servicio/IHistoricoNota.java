package uniajc.edu.servicio;

import java.util.ArrayList;

import uniajc.edu.model.HistoricoNota;

public interface IHistoricoNota {
	public ArrayList<HistoricoNota> getHistoricoNota(String id,String ano,String periodo);
}
