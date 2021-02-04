/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Classifier} with << HwBus_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2f2dcaf3-c7ca-4e67-8588-aff7f7dbaed9")
public class HwBusClassifier extends HwMediaClassifier {
    @objid ("e43a8594-8c8d-44b6-a619-d5f39988899b")
    public static final String STEREOTYPE_NAME = "HwBus_Classifier";

    @objid ("069aa48e-e537-44f4-b5c3-6168465ad8bd")
    public static final String HWBUS_CLASSIFIER_ADRESSWIDTH_TAGTYPE = "HwBus_Classifier_adressWidth";

    @objid ("04b44dad-64a5-4241-bf79-78b75b144553")
    public static final String HWBUS_CLASSIFIER_ISSERIAL_TAGTYPE = "HwBus_Classifier_isSerial";

    @objid ("d85c32a7-cead-4558-80d8-cb0847b16c55")
    public static final String HWBUS_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE = "HwBus_Classifier_isSynchronous";

    @objid ("ea7ff6a8-bc4f-49bb-b58b-91f441d4be55")
    public static final String HWBUS_CLASSIFIER_WORDWIDTH_TAGTYPE = "HwBus_Classifier_wordWidth";

    /**
     * Tells whether a {@link HwBusClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwBus_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("66fb84c2-799c-4ed2-8af9-27249e585fff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwBus_Classifier >> then instantiate a {@link HwBusClassifier} proxy.
     * 
     * @return a {@link HwBusClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("02fb28b8-edb4-449f-9bac-c2966124d27e")
    public static HwBusClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusClassifier.STEREOTYPE_NAME);
        return HwBusClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwBusClassifier} proxy from a {@link Classifier} stereotyped << HwBus_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwBusClassifier} proxy or <i>null</i>.
     */
    @objid ("764771b5-c113-49eb-9e5e-1891e4048964")
    public static HwBusClassifier instantiate(final Classifier obj) {
        return HwBusClassifier.canInstantiate(obj) ? new HwBusClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBusClassifier} proxy from a {@link Classifier} stereotyped << HwBus_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwBusClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("00abb9e2-2e87-493d-84c3-fdab275cda6f")
    public static HwBusClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwBusClassifier.canInstantiate(obj))
        	return new HwBusClassifier(obj);
        else
        	throw new IllegalArgumentException("HwBusClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9caec359-0c31-46e5-b482-31e277c03e9a")
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
        HwBusClassifier other = (HwBusClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("05613a1e-e95e-4e10-a0f6-e1343e387aff")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Classifier_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0b49f8b2-fbad-4589-a5ca-b140f8a4bd8d")
    public String getHwBus_Classifier_adressWidth() {
        return this.elt.getTagValue(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Classifier_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22d515a2-041e-426b-8ced-1d18dca54307")
    public String getHwBus_Classifier_wordWidth() {
        return this.elt.getTagValue(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_WORDWIDTH_TAGTYPE_ELT);
    }

    @objid ("bafd86af-991f-4c74-a0af-8b70757a6b91")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Classifier_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8549eaf-d1bd-4c3e-9b8c-9f96ae0dd339")
    public boolean isHwBus_Classifier_isSerial() {
        return this.elt.isTagged(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Classifier_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4f78cdb3-7dd9-4b7a-9e5d-5bcaeaec9672")
    public boolean isHwBus_Classifier_isSynchronous() {
        return this.elt.isTagged(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Classifier_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9e61135-3db1-4851-a356-c0569ae24a5c")
    public void setHwBus_Classifier_adressWidth(final String value) {
        this.elt.putTagValue(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Classifier_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4624fa14-9d6d-4974-a71d-6f689ef77f10")
    public void setHwBus_Classifier_isSerial(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ISSERIAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwBus_Classifier_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8fe599ac-2510-4efe-9fb4-9c9276cc1d1c")
    public void setHwBus_Classifier_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Classifier_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5ee8e13f-44a0-4299-920e-9d92edc38cfa")
    public void setHwBus_Classifier_wordWidth(final String value) {
        this.elt.putTagValue(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_WORDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("010f1051-8e92-4c67-8b61-79a9a4ba74b0")
    protected HwBusClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("cfd24ae8-42a9-4f99-936b-2fc6972f3c25")
    public static final class MdaTypes {
        @objid ("ae35fd32-303a-4881-ad99-a018776fee80")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("70e8cad4-33cd-4978-ab34-b589f2cd9702")
        public static TagType HWBUS_CLASSIFIER_ADRESSWIDTH_TAGTYPE_ELT;

        @objid ("ea242826-498a-4f87-b6ff-4a0bfeeed49d")
        public static TagType HWBUS_CLASSIFIER_WORDWIDTH_TAGTYPE_ELT;

        @objid ("f65c2860-9f3d-45ea-87e0-fd4859384782")
        public static TagType HWBUS_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("394a6ea7-646a-4655-b029-4982a16dc824")
        public static TagType HWBUS_CLASSIFIER_ISSERIAL_TAGTYPE_ELT;

        @objid ("11c05d22-a8f2-4ec4-b4e2-35cbc2be3c7e")
        private static Stereotype MDAASSOCDEP;

        @objid ("0bfd1042-74b1-4da6-994a-c3641ac605b3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("10b34f11-7c63-47a6-a5b3-7c3e34f51d40")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "855b4eab-10ac-11df-81d9-0014222a9f79");
            HWBUS_CLASSIFIER_ADRESSWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "855b4ead-10ac-11df-81d9-0014222a9f79");
            HWBUS_CLASSIFIER_WORDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "855b4eae-10ac-11df-81d9-0014222a9f79");
            HWBUS_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a744fd21-1707-11df-b92a-0014222a9f79");
            HWBUS_CLASSIFIER_ISSERIAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a744fd22-1707-11df-b92a-0014222a9f79");
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
