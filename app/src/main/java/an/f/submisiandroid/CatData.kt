package an.f.submisiandroid

object CatData {
    private var data = arrayOf(
        arrayOf(
            "Persian cat",
            "Felis catus",
            "https://upload.wikimedia.org/wikipedia/commons/1/15/White_Persian_Cat.jpg",
            "The Persian cat is a long-haired breed of cat characterized by its round face and short muzzle. It is also known as the \"Persian Longhair\" in the English-speaking countries. The first documented ancestors of the Persian were imported into Italy from Iran around"

        ),
        arrayOf(
            "British Shorthair",
            "Felis catus",
            "data:image/jpeg;base64,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",
            "The British Shorthair is the pedigreed version of the traditional British domestic cat, with a distinctively stocky body, dense coat, and broad face. The most familiar color variant is the \"British Blue,\" a solid grey-blue coat, orange eyes, and a medium-sized tail."

        ),
        arrayOf(
            "Maine Coon",
            "Felis catus",
            "https://i.pinimg.com/originals/5c/2c/44/5c2c44f16da1caf134c00bc4f9c72ea0.jpg",
            "The Maine Coon is the largest domesticated cat breed. It has a distinctive physical appearance and valuable hunting skills. It is one of the oldest natural breeds in North America, specifically native to the US state of Maine, where it is the official state cat. "

        ),
        arrayOf(
            "Siamese cat",
            "Felis catus",
            "https://lh3.googleusercontent.com/proxy/bOSsxr4VDw6j9sLNwoy7Fq1umZl5cIcAx22MeplDL9ZvMlwav3Na6UxfsHm7EfnbhODbR0_Hj1_HWbrWFQjKmzEcHXA0aDnf4i4R-0L_as5VBTo1jit9tA",
            "The Siamese cat is one of the first distinctly recognized breeds of Asian cat. Derived from the Wichianmat landrace, one of several varieties of cat native to Thailand, the original Siamese became one of the most popular breeds in Europe and North America in the 19th century."

        ),
        arrayOf(
            "American Shorthair",
            "Felis catus",
            "https://d17fnq9dkz9hgj.cloudfront.net/breed-uploads/2018/08/american-shorthair-detail.jpg?bust=1535566898&width=355",
            "The American Shorthair is a breed of domestic cat believed to be descended from European cats brought to North America by early settlers to protect valuable cargo from mice and rats. According to the Cat Fanciers' Association, in 2012, it was the seventh most popular pedigreed cat in the United States."


        ),
        arrayOf(
            "Ragdoll",
            "Felis catus",
            "https://uk.mypetandi.com/sites/g/files/adhwdz331/files/styles/paragraph_image/public/2018-03/ragdoll_cat_01401.jpg?itok=GLukk3cG",
            "The Ragdoll is a cat breed with a color point coat and blue eyes. They are large and muscular semi-longhair cats with a soft and silky coat. Developed by American breeder Ann Baker in the 1960s, they are best known for their docile and placid temperament and affectionate nature."

        ),
        arrayOf(
            "Sphynx cat",
            "Felis catus",
            "https://product-image.juniqe-production.juniqe.com/media/catalog/product/seo-cache/x800/642/23/642-23-101X/Sphynx-Cat-Paul-Fuentes-Poster.jpg",
            "The Sphynx cat is a breed of cat known for its lack of coat. Hairlessness in cats is a naturally occurring genetic mutation; however, the Sphynx cat, as a breed, was developed through selective breeding, starting in the 1960s."

        ),
        arrayOf(
            "Bengal cat",
            "Felis catus × Prionailurus bengalensis",
            "data:image/jpeg;base64,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",
            "The Bengal cat is a domesticated cat breed created from hybrids of domestic cats, especially the spotted Egyptian Mau, with the Asian leopard cat. The breed name comes from the leopard cat's taxonomic name."

        ),
        arrayOf(
            "Abyssinian cat",
            "Felis catus",
            "https://www.purina.co.uk/sites/g/files/mcldtz2481/files/styles/nppe_breed_selector_500/public/breed_library/cat_abyssinian.jpg?itok=3McqTnkw",
            "The Abyssinian is a breed of domestic short-haired cat with a distinctive \"ticked\" tabby coat, in which individual hairs are banded with different colors. In nomenclature terms, they are also known as simply Abys. The breed is named for Abyssinia, where it is believed to have originated."

        ),
        arrayOf(
            "Birman",
            "Felis catus",
            "https://d17fnq9dkz9hgj.cloudfront.net/breed-uploads/2018/08/birman-detail.jpg?bust=1535566930&width=355",
            "The Birman, also called the \"Sacred Cat of Burma\", is a domestic cat breed. The Birman is a long-haired, colour-pointed cat distinguished by a silky coat, deep blue eyes, and contrasting white \"gloves\" or \"socks\" on each paw. The breed name is derived from Birmanie, the French form of Burma."

        )
    )

    val listData: ArrayList<Cat>
        get() {
            val list = ArrayList<Cat>()
            for (aData in data) {
                val cat = Cat()
                cat.name = aData[0]
                cat.nama_ilmiah = aData[1]
                cat.photo = aData[2]
                cat.deskripsi = aData[3]


                list.add(cat)
            }
            return list
        }
}