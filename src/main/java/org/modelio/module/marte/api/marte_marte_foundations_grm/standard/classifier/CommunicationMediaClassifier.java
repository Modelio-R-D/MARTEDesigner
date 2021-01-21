/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << CommunicationMedia_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d08badd6-d915-43bd-8fe9-99cada0a9153")
public class CommunicationMediaClassifier extends ProcessingResourceClassifier {
    @objid ("2b638bf0-fc6c-4bc4-93a6-c97b80522c2c")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Classifier";

    @objid ("7654d2b9-f824-4e0d-8886-52fee390eafd")
    public static final String COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE = "CommunicationMedia_Classifier_blockT";

    @objid ("d64fa128-a7e0-4ec0-ae3c-745d4536450d")
    public static final String COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE = "CommunicationMedia_Classifier_capacity";

    @objid ("0cc3e18d-f087-46a4-9609-c58a40805395")
    public static final String COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Classifier_elementSize";

    @objid ("ce9aee5a-1235-4f46-9725-0c8cb3683521")
    public static final String COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE = "CommunicationMedia_Classifier_packetT";

    @objid ("01e7f2a0-752c-482b-baa2-886da7019aaf")
    public static final String COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE = "CommunicationMedia_Classifier_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << CommunicationMedia_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a23a2e5d-9b9b-44ce-9f35-44aa62866be0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << CommunicationMedia_Classifier >> then instantiate a {@link CommunicationMediaClassifier} proxy.
     * 
     * @return a {@link CommunicationMediaClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("e41d779d-6b29-4e98-8895-eda07e75d7ad")
    public static CommunicationMediaClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaClassifier.STEREOTYPE_NAME);
        return CommunicationMediaClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaClassifier} proxy from a {@link Classifier} stereotyped << CommunicationMedia_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link CommunicationMediaClassifier} proxy or <i>null</i>.
     */
    @objid ("a1369687-a87d-4b71-9a5e-827e22b9b3b4")
    public static CommunicationMediaClassifier instantiate(final Classifier obj) {
        return CommunicationMediaClassifier.canInstantiate(obj) ? new CommunicationMediaClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaClassifier} proxy from a {@link Classifier} stereotyped << CommunicationMedia_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link CommunicationMediaClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1c570bb1-45d5-4445-aa3b-5dd73dd8ad01")
    public static CommunicationMediaClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (CommunicationMediaClassifier.canInstantiate(obj))
        	return new CommunicationMediaClassifier(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bad56597-c175-4ed7-9992-52f21f916c2d")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CommunicationMediaClassifier other = (CommunicationMediaClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Classifier_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d0248150-a7fd-4804-a763-50f6c8ba246c")
    public List<String> getCommunicationMedia_Classifier_blockT() {
        return this.elt.getTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Classifier_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d89f715c-ca66-4d6a-b1b1-ea8cd0e7950b")
    public List<String> getCommunicationMedia_Classifier_capacity() {
        return this.elt.getTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e871df7e-2cc3-4afb-af61-d75f93ec4694")
    public String getCommunicationMedia_Classifier_elementSize() {
        return this.elt.getTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Classifier_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("23a91d6c-6d7c-408e-b56b-64a025f0c541")
    public List<String> getCommunicationMedia_Classifier_packetT() {
        return this.elt.getTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Classifier_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d0c4f84c-17fa-421d-9584-cf8a7917049b")
    public String getCommunicationMedia_Classifier_transmMode() {
        return this.elt.getTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("f3cc92e8-0ea0-4bce-8ee7-42b3892ff9e1")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("7c30a6e9-246e-4280-98e5-38f9d600ce72")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Classifier_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("00cc9880-ab2e-456d-ab40-4db5e314a34c")
    public void setCommunicationMedia_Classifier_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b6744751-cffd-4d1c-830f-b12ab6e93389")
    public void setCommunicationMedia_Classifier_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2a91786-016a-46f9-8da2-4df632815185")
    public void setCommunicationMedia_Classifier_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Classifier_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("20a41c49-88cf-4372-89a2-5df22dba6780")
    public void setCommunicationMedia_Classifier_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Classifier_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0996731f-7465-41f7-ad1a-bfd87908c8f2")
    public void setCommunicationMedia_Classifier_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("2d25a58f-4e56-4ef5-926c-83636522af38")
    protected CommunicationMediaClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("5d76f384-be11-49c3-82e2-92917d1c6163")
    public static final class MdaTypes {
        @objid ("322d117b-c419-4c62-8da1-1eaec9838906")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("652bd107-7a57-4f7c-af28-c3c83c2e4561")
        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("73664b00-d506-40fc-8ae0-92bb31871852")
        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT;

        @objid ("80a480bb-03c1-4250-8fb9-fd204ed780c7")
        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT;

        @objid ("6f050b58-0799-4db3-b607-e70c262d9cbf")
        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT;

        @objid ("9af81c7c-c642-418d-971f-21ebd59391a3")
        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT;

        @objid ("3a4a9f75-57cc-415b-8b20-5c1cb2afb401")
        private static Stereotype MDAASSOCDEP;

        @objid ("f83c4dcf-0246-4042-8cf5-47a198dc3d11")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bfcd2754-524e-49b8-8daa-2f79b15fd056")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e136b5f3-0fdc-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8da5102-0fdc-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8da5103-0fdc-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8da5104-0fdc-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8da5105-0fdc-11df-86ac-0014222a9f79");
            COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8da5106-0fdc-11df-86ac-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
