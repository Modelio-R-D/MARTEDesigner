/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("93e07c62-1870-4f0d-9370-47aa29f7edb2")
    public static final String STEREOTYPE_NAME = "CommunicationMedia_Classifier";

    @objid ("79301861-4ff8-49a3-a2e5-40b1f251456b")
    public static final String COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE = "CommunicationMedia_Classifier_blockT";

    @objid ("8dd7243d-dc95-4fc5-9a49-947eb49685f9")
    public static final String COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE = "CommunicationMedia_Classifier_capacity";

    @objid ("52a27bf1-4cdf-4b68-91dd-070c6951ea0e")
    public static final String COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE = "CommunicationMedia_Classifier_elementSize";

    @objid ("1e97a69d-43b2-4876-bd61-23bc96b61667")
    public static final String COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE = "CommunicationMedia_Classifier_packetT";

    @objid ("756681bd-db25-4766-887e-443fd42939d3")
    public static final String COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE = "CommunicationMedia_Classifier_transmMode";

    /**
     * Tells whether a {@link CommunicationMediaClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << CommunicationMedia_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2c74b28b-f2ac-4f1e-bc70-f0f96bfe3b15")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << CommunicationMedia_Classifier >> then instantiate a {@link CommunicationMediaClassifier} proxy.
     * 
     * @return a {@link CommunicationMediaClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("4fc39b5b-48a6-4902-b6c1-af99638fc473")
    public static CommunicationMediaClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationMediaClassifier.STEREOTYPE_NAME);
        return CommunicationMediaClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationMediaClassifier} proxy from a {@link Classifier} stereotyped << CommunicationMedia_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link CommunicationMediaClassifier} proxy or <i>null</i>.
     */
    @objid ("f83ef566-f8fe-4625-bc2d-de698be3ad6a")
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
    @objid ("d5988185-9e7f-45d5-9648-9a95dfb87627")
    public static CommunicationMediaClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (CommunicationMediaClassifier.canInstantiate(obj))
        	return new CommunicationMediaClassifier(obj);
        else
        	throw new IllegalArgumentException("CommunicationMediaClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cc13e064-07f9-4c20-a47b-1f03f3c1d800")
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
    @objid ("4be0d572-6fae-42f6-8345-d76a134aaa36")
    public List<String> getCommunicationMedia_Classifier_blockT() {
        return this.elt.getTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Classifier_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("10a70b99-158f-4584-a98a-bbd09617cb40")
    public List<String> getCommunicationMedia_Classifier_capacity() {
        return this.elt.getTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa68886c-9bbb-4f88-b0e9-e89a4b0e8ae5")
    public String getCommunicationMedia_Classifier_elementSize() {
        return this.elt.getTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'CommunicationMedia_Classifier_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("29cedb42-1a76-4b57-93ff-1fc6a3ca0c53")
    public List<String> getCommunicationMedia_Classifier_packetT() {
        return this.elt.getTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'CommunicationMedia_Classifier_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ea64075-5871-42b9-bd4b-3e4561466fc9")
    public String getCommunicationMedia_Classifier_transmMode() {
        return this.elt.getTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("f4d1a62e-906c-4c32-885c-0f429dff952b")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("f4914995-38cf-49de-99fe-d69883d69d3c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Classifier_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1eda3484-0eb1-45b3-8564-692b99dd02ff")
    public void setCommunicationMedia_Classifier_blockT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("50fcbbcb-c1d0-40a2-a840-338062599b55")
    public void setCommunicationMedia_Classifier_capacity(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("457b3d4a-e3ae-4cd2-ab2e-50728df3c45b")
    public void setCommunicationMedia_Classifier_elementSize(final String value) {
        this.elt.putTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'CommunicationMedia_Classifier_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c5a6df1-fa27-4510-966a-fcb5824bc2ff")
    public void setCommunicationMedia_Classifier_packetT(final List<String> values) {
        this.elt.putTagValues(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'CommunicationMedia_Classifier_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1eb5de83-5396-453d-907f-9eaf4736910e")
    public void setCommunicationMedia_Classifier_transmMode(final String value) {
        this.elt.putTagValue(CommunicationMediaClassifier.MdaTypes.COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("8ae444ef-562b-4951-8755-3a480c672a55")
    protected CommunicationMediaClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("5d76f384-be11-49c3-82e2-92917d1c6163")
    public static final class MdaTypes {
        @objid ("d9dc21a0-851f-4f5f-b588-fca7f287f473")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("63ccc066-70ff-46d6-a6c9-a42e104d09b0")
        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("512da04d-5b25-4ecf-9bc3-a71064258352")
        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT;

        @objid ("ad339fa8-3457-477a-864e-9e43eaf4a0ff")
        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT_TAGTYPE_ELT;

        @objid ("1fceea27-fc13-4d71-96cc-6fe8fec73165")
        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_PACKETT_TAGTYPE_ELT;

        @objid ("489a790b-5ed7-4a29-821f-a52c8290d33d")
        public static TagType COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY_TAGTYPE_ELT;

        @objid ("6b4d4b4a-2e6a-4505-ab95-11fba70db6d8")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd72eb54-b8fe-4a80-9c97-65b10461df30")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8c5a8c85-4dfc-4c99-9bd4-83fec2efe862")
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
