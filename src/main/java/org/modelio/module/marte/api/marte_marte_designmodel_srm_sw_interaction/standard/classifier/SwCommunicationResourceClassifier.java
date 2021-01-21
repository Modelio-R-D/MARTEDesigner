/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << SwCommunicationResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5b175e61-c02e-4c47-8b26-294cabfefeb5")
public class SwCommunicationResourceClassifier extends SwInteractionResourceClassifier {
    @objid ("1dd0849f-9ceb-4d2b-a7ff-d0facf9e748e")
    public static final String STEREOTYPE_NAME = "SwCommunicationResource_Classifier";

    @objid ("99f8a2a2-8656-424c-82fd-b1edc6ddb6bc")
    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT_TAGTYPE = "SwCommunicationResource_Classifier_blockT";

    @objid ("574ca850-2f5f-4d61-80b8-e96b1448f0f0")
    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE = "SwCommunicationResource_Classifier_capacity";

    @objid ("421b2848-25f3-4e36-a8e2-927d5b3647e9")
    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE = "SwCommunicationResource_Classifier_elementSize";

    @objid ("e5969a5c-33fc-4895-b842-da5bf79d840b")
    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE = "SwCommunicationResource_Classifier_mainScheduler";

    @objid ("6051972c-07ab-49f8-a95f-88ebba27feac")
    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT_TAGTYPE = "SwCommunicationResource_Classifier_packetT";

    @objid ("9df76fc8-6aae-48b4-8f7d-ad9ed3db1e70")
    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE = "SwCommunicationResource_Classifier_speedFactor";

    @objid ("4d2fa51c-18bc-42b7-8878-05d94d101099")
    public static final String SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE_TAGTYPE = "SwCommunicationResource_Classifier_transmMode";

    /**
     * Tells whether a {@link SwCommunicationResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwCommunicationResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("61058b2a-9c15-469b-9078-7c5589885e8c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwCommunicationResource_Classifier >> then instantiate a {@link SwCommunicationResourceClassifier} proxy.
     * 
     * @return a {@link SwCommunicationResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("83df64bb-a014-48ee-b25c-d47efcd37983")
    public static SwCommunicationResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwCommunicationResourceClassifier.STEREOTYPE_NAME);
        return SwCommunicationResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceClassifier} proxy from a {@link Classifier} stereotyped << SwCommunicationResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwCommunicationResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("265af496-b5b1-42c5-957a-5dba0a52b728")
    public static SwCommunicationResourceClassifier instantiate(final Classifier obj) {
        return SwCommunicationResourceClassifier.canInstantiate(obj) ? new SwCommunicationResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwCommunicationResourceClassifier} proxy from a {@link Classifier} stereotyped << SwCommunicationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwCommunicationResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8461109e-e87a-4212-8a2f-753ee905875b")
    public static SwCommunicationResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwCommunicationResourceClassifier.canInstantiate(obj))
        	return new SwCommunicationResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwCommunicationResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8e3e5b9e-8893-4281-bdc5-343fc5974b77")
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
        SwCommunicationResourceClassifier other = (SwCommunicationResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("bae0ef08-7f50-4cfe-a6bd-15aa220bf1f6")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Classifier_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("25af9a63-48c9-4807-af0c-1e70a2c7e585")
    public List<String> getSwCommunicationResource_Classifier_blockT() {
        return this.elt.getTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Classifier_capacity'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d0fd2584-26a4-4fd5-84fb-34055f4c8cc4")
    public List<String> getSwCommunicationResource_Classifier_capacity() {
        return this.elt.getTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ebd8006-6e71-42a9-89f6-e61ee9e1a817")
    public String getSwCommunicationResource_Classifier_elementSize() {
        return this.elt.getTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Classifier_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("29111ea2-05a0-4cfa-b4c9-9e10b6aee2e9")
    public String getSwCommunicationResource_Classifier_mainScheduler() {
        return this.elt.getTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SwCommunicationResource_Classifier_packetT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("378b8032-b0db-4976-822c-d6e9e23bff0f")
    public List<String> getSwCommunicationResource_Classifier_packetT() {
        return this.elt.getTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Classifier_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("819a69a3-19e9-40dc-a1fe-ce84bd5de579")
    public String getSwCommunicationResource_Classifier_speedFactor() {
        return this.elt.getTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwCommunicationResource_Classifier_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49a9ffc4-5860-4369-93c8-eb9be64092be")
    public String getSwCommunicationResource_Classifier_transmMode() {
        return this.elt.getTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT);
    }

    @objid ("4e2766dd-80a7-439c-ba0b-e8b1adde9b32")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Classifier_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("37134fb2-5825-494d-b8a3-779dd31fa115")
    public void setSwCommunicationResource_Classifier_blockT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Classifier_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("39ad4803-93b8-4512-af4f-730a3d2d0d80")
    public void setSwCommunicationResource_Classifier_capacity(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b0a34726-7c69-44a8-93cd-27557627f1e8")
    public void setSwCommunicationResource_Classifier_elementSize(final String value) {
        this.elt.putTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Classifier_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70db3089-c88e-4316-acee-d73901db2f43")
    public void setSwCommunicationResource_Classifier_mainScheduler(final String value) {
        this.elt.putTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'SwCommunicationResource_Classifier_packetT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a290af88-f38d-449c-be32-00d8efdc1f39")
    public void setSwCommunicationResource_Classifier_packetT(final List<String> values) {
        this.elt.putTagValues(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Classifier_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4752c1bd-4824-489b-86bd-2fe3a761d923")
    public void setSwCommunicationResource_Classifier_speedFactor(final String value) {
        this.elt.putTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwCommunicationResource_Classifier_transmMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba0e9f72-86a4-4ac3-b05f-4f2e823405d2")
    public void setSwCommunicationResource_Classifier_transmMode(final String value) {
        this.elt.putTagValue(SwCommunicationResourceClassifier.MdaTypes.SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT, value);
    }

    @objid ("e7784e3b-2490-44c5-aeb9-4a433ae4d9bc")
    protected SwCommunicationResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("c150f1d0-0b72-44fd-b341-df0cdccc8d76")
    public static final class MdaTypes {
        @objid ("43215799-d9f0-44fd-b5ef-1580c8f19ba6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("de88797f-cf5b-424c-b3af-fd2947b88041")
        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT_TAGTYPE_ELT;

        @objid ("98eee844-aa41-413c-9957-73287b49c015")
        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT_TAGTYPE_ELT;

        @objid ("79809c36-ac21-46c6-99c1-35f3c7a6a3e6")
        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT;

        @objid ("970b99cd-39ec-421f-b9cd-ba95735662d3")
        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("6dbd8b6e-5b87-46d6-b5cf-17feb071e06e")
        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("75e4a19c-7f05-4ab6-b505-d856af96efec")
        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("aa50cd9b-355f-4994-b754-b8548dd2d91a")
        public static TagType SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT;

        @objid ("c581f2d6-4fcf-4526-9bd2-247c269b5376")
        private static Stereotype MDAASSOCDEP;

        @objid ("53b8a6f4-6c75-470f-9f81-f82c31c0d613")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c123784e-1569-40d6-8e6c-224cfbfdc29e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "59980f9a-10d8-11df-81d9-0014222a9f79");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "86cac50c-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_PACKETT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "86cac50b-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "86cac50a-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "86cac509-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "86cac508-92ad-11e0-a69d-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b1ab965e-97f8-11e0-a4c3-0027103f347c");
            SWCOMMUNICATIONRESOURCE_CLASSIFIER_TRANSMMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a98ac6ba-60ca-11e3-a828-0027103f347d");
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
