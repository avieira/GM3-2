public class GenerateurDrapeaux{
	private ListeDeDrapeaux listeDrap;
	private Drapeau drapeauCourant;
	private String[] listeNom={
"Afghanistan",
"Afrique du sud",
"Argentine",
"Albanie",
"Algerie",
"Allemagne",
"Andorre",
"Angola",
"Antigua et barbuda",
"Antilles neerlandaises",
"Arabie saoudite",
"Armenie",
"Aruba",
"Australie",
"Autriche",
"Azerbaidjan",
"Bahamas",
"Bahrain",
"Bangladesh",
"Barbades",
"Belgique",
"Belize",
"Benin",
"Bermudes",
"Bhoutan",
"Bielorussie",
"Bolivie",
"Bosnie",
"Botswana",
"Bresil",
"Brunei",
"Bulgarie",
"Burkina Faso",
"Burundi",
"Cambodge",
"Cameroun",
"Canada",
"Cap Vert",
"Chili",
"Chine",
"Chypre",
"Colombie",
"Comores",
"Coree du Nord",
"Coree du Sud",
"Costa Rica",
"Cote d Ivoire",
"Croatie",
"Cuba",
"Danemark",
"Djibouti",
"Dominique",
"Ecosse",
"Egypte",
"Equateur",
"Erythree",
"Espagne",
"Estonie",
"Etats Unis",
"Ethiopie",
"Finlande",
"France",
"Gabon",
"Gambie",
"Georgie",
"Ghana",
"Gibraltar",
"Grece",
"Grenade",
"Groenland",
"Guatemala",
"Guinee Bissau",
"Guinee Equatoriale",
"Guinee",
"Guyane",
"Haiti",
"Honduras",
"Hong Kong",
"Hongrie",
"Iles Caiman",
"Iles Christmas",
"Iles Cook",
"Iles Falkland",
"Iles Feroe",
"Iles Marshall",
"Inde",
"Indonesie",
"Irak",
"Iran",
"Irlande",
"Islande",
"Israel",
"Italie",
"Jamaique",
"Japon",
"Jordanie",
"Kazakhstan",
"Kenya",
"Kirabati",
"Kirghizistan",
"Koweit",
"Laos",
"Lesotho",
"Lettonie",
"Liban",
"Liberia",
"Libye",
"Liechtenstein",
"Lituanie",
"Luxembourg",
"Macao",
"Macedoine",
"Madagascar",
"Malaisie",
"Malawi",
"Maldives",
"Mali",
"Malte",
"Maroc",
"Maurice",
"Mauritanie",
"Mexique",
"Micronesie",
"Moldavie",
"Monaco",
"Mongolie",
"Montenegro",
"Montserrat",
"Mozambique",
"Myanmar",
"Namibie",
"Nauru",
"Nepal",
"Nicaragua",
"Nigeria",
"Niger",
"Nouvelle Zelande",
"Norvege",
"Oman",
"Ouganda",
"Ouzbekistan",
"Pakistan",
"Palaos",
"Panama",
"Papouasie Nouvelle Guinee",
"Paraguay",
"Pays Bas",
"Perou",
"Philippines",
"Pologne",
"Polynesie Française",
"Porto Rico",
"Portugal",
"Qatar",
"Republique Centrafricaine",
"Republique Democratique du Congo",
"Republique Dominicaine",
"Republique du Congo",
"Republique Tcheque",
"Roumanie",
"Royaume Uni",
"Russie",
"Rwanda",
"Saint Christophe et Nevies",
"Sainte Lucie",
"Saint Marin",
"Saint Vincent et les Grenadines",
"Salomon",
"Salvador",
"Samoa",
"Sao Tome et Principe",
"Senegal",
"Serbie",
"Seychelles",
"Sierra Leone",
"Singapour",
"Slovaquie",
"Slovenie",
"Somalie",
"Soudan",
"Sri Lanka",
"Suede",
"Suisse",
"Suriname",
"Swaziland",
"Syrie",
"Tadjikistan",
"Taiwan",
"Tanzanie",
"Tchad",
"Thailande",
"Tibet",
"Timor Oriental",
"Togo",
"Tonga",
"Trinite et Tobago",
"Tunisie",
"Turkmenistan",
"Turquie",
"Tuvalu",
"Ukraine",
"Uruguay",
"Vanuatu",
"Vatican",
"Venezuela",
"Vietnam",
"Yemen",
"Zambie",
"Zimbabwe"
};
	private String[] listeChemin={
"afghanistan.png",
"afrique_du_sud.png",
"argentine.png",
"albanie.png",
"algerie.png",
"allemagne.png",
"andorre.png",
"angola.png",
"antigua_et_barbuda.png",
"antilles_neerlandaises.png",
"arabie_saoudite.png",
"armenie.png",
"aruba.png",
"australie.png",
"autriche.png",
"azerbaidjan.png",
"bahamas.png",
"bahrain.png",
"bangladesh.png",
"barbades.png",
"belgique.png",
"belize.png",
"benin.png",
"bermudes.png",
"bhoutan.png",
"bielorussie.png",
"bolivia.png",
"bosnie.png",
"botswana.png",
"bresil.png",
"brunei.png",
"bulgarie.png",
"burkina_faso.png",
"burundi.png",
"cambodge.png",
"cameroun.png",
"canada.png",
"cap_vert.png",
"chili.png",
"chine.png",
"chypre.png",
"colombie.png",
"comores.png",
"coree_du_nord.png",
"coree_du_sud.png",
"costa_rica.png",
"cote_d_ivoire.png",
"croatie.png",
"cuba.png",
"danemark.png",
"djibouti.png",
"dominique.png",
"ecosse.png",
"egypte.png",
"equateur.png",
"erythree.png",
"espagne.png",
"estonie.png",
"etats_unis.png",
"ethiopie.png",
"finlande.png",
"france.png",
"gabon.png",
"gambie.png",
"georgie.png",
"ghana.png",
"gibraltar.png",
"grece.png",
"grenade.png",
"groenland.png",
"guatemala.png",
"guinee_bissau.png",
"guinee_equatoriale.png",
"guinee.png",
"guyane.png",
"haiti.png",
"honduras.png",
"hong_kong.png",
"hongrie.png",
"iles_caiman.png",
"iles_christmas.png",
"iles_cook.png",
"iles_falkland.png",
"iles_feroe.png",
"iles_marshall.png",
"inde.png",
"indonesie.png",
"irak.png",
"iran.png",
"irlande.png",
"islande.png",
"israel.png",
"italie.png",
"jamaique.png",
"japon.png",
"jordanie.png",
"kazakhstan.png",
"kenya.png",
"kirabati.png",
"kirghizistan.png",
"koweit.png",
"laos.png",
"lesotho.png",
"lettonie.png",
"liban.png",
"liberia.png",
"libye.png",
"liechtenstein.png",
"lituanie.png",
"luxembourg.png",
"macao.png",
"macedoine.png",
"madagascar.png",
"malaisie.png",
"malawi.png",
"maldives.png",
"mali.png",
"malte.png",
"maroc.png",
"maurice.png",
"mauritanie.png",
"mexique.png",
"micronesie.png",
"moldavie.png",
"monaco.png",
"mongolia.png",
"montenegro.png",
"montserrat.png",
"mozambique.png",
"myanmar.png",
"namibie.png",
"nauru.png",
"nepal.png",
"nicaragua.png",
"nigeria.png",
"niger.png",
"nouvelle_zelande.png",
"norvege.png",
"oman.png",
"ouganda.png",
"ouzbekistan.png",
"pakistan.png",
"palaos.png",
"panama.png",
"papouasie_nouvelle_guinee.png",
"paraguay.png",
"pays_bas.png",
"perou.png",
"philippines.png",
"pologne.png",
"polynesie_française.png",
"porto_rico.png",
"portugal.png",
"qatar.png",
"republique_centrafricaine.png",
"republique_democratique_du_congo.png",
"republique_dominicaine.png",
"republique_du_congo.png",
"republique_tcheque.png",
"roumanie.png",
"royaume_uni.png",
"russie.png",
"rwanda.png",
"saint_christophe_et_nevies.png",
"sainte_lucie.png",
"saint_marin.png",
"saint_vincent_et_les_grenadines.png",
"salomon.png",
"salvador.png",
"samoa.png",
"sao_tome_et_principe.png",
"senegal.png",
"serbie.png",
"seychelles.png",
"sierra_leone.png",
"singapour.png",
"slovaquie.png",
"slovenie.png",
"somalie.png",
"soudan.png",
"sri_lanka.png",
"suede.png",
"suisse.png",
"suriname.png",
"swaziland.png",
"syrie.png",
"tadjikistan.png",
"taiwan.png",
"tanzanie.png",
"tchad.png",
"thailande.png",
"tibet.png",
"timor_oriental.png",
"togo.png",
"tonga.png",
"trinite_et_tobago.png",
"tunisie.png",
"turkmenistan.png",
"turquie.png",
"tuvalu.png",
"ukraine.png",
"uruguay.png",
"vanuatu.png",
"vatican.png",
"venezuela.png",
"vietnam.png",
"yemen.png",
"zambie.png",
"zimbabwe.png"
        };

	private GenerateurNbAleatoire generAlea=new GenerateurNbAleatoire(0,listeNom.length);

	public GenerateurDrapeaux(){
		listeDrap=new ListeDeDrapeaux(listeNom, listeChemin);
		drapeauCourant=listeDrap.getDrapeau(generAlea.genererNb());
	}

	public Drapeau getDrapeauCourant(){
		return drapeauCourant;
	}

	public void changerDrapeau(){
		drapeauCourant=listeDrap.getDrapeau(generAlea.genererNb());
	}
}