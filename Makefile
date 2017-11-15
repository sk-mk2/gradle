docker.pdf: docker.dvi
	dvipdfmx docker.dvi

docker.dvi: docker.tex
	platex docker.tex

.PHONY: clean
clean:
	@rm -f *.aux *.dvi *.log *.pdf
