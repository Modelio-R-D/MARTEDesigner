/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("491bb948-3e0a-4f43-adb7-8cf7849dfec0")
    public static final String STEREOTYPE_NAME = "HwBus_Classifier";

    @objid ("3f0ad808-048d-4409-9a24-6cfa75f96921")
    public static final String HWBUS_CLASSIFIER_ADRESSWIDTH_TAGTYPE = "HwBus_Classifier_adressWidth";

    @objid ("d77ec3f8-6b62-46a0-a96a-fa2973e31c77")
    public static final String HWBUS_CLASSIFIER_ISSERIAL_TAGTYPE = "HwBus_Classifier_isSerial";

    @objid ("01fca72e-1e92-4483-af64-2c662e776033")
    public static final String HWBUS_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE = "HwBus_Classifier_isSynchronous";

    @objid ("6c1af182-a94d-4e80-aff8-464f2279cbae")
    public static final String HWBUS_CLASSIFIER_WORDWIDTH_TAGTYPE = "HwBus_Classifier_wordWidth";

    /**
     * Tells whether a {@link HwBusClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwBus_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d221a367-7ecf-4fb5-925c-f17d0d8ea7ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwBus_Classifier >> then instantiate a {@link HwBusClassifier} proxy.
     * 
     * @return a {@link HwBusClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("771997d9-f57d-4dca-9e61-c141d66adc13")
    public static HwBusClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusClassifier.STEREOTYPE_NAME);
        return HwBusClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwBusClassifier} proxy from a {@link Classifier} stereotyped << HwBus_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwBusClassifier} proxy or <i>null</i>.
     */
    @objid ("c786d4a5-0a2d-454a-a6db-202f93094362")
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
    @objid ("da10eb18-6765-42be-89eb-5c379665eb47")
    public static HwBusClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwBusClassifier.canInstantiate(obj))
        	return new HwBusClassifier(obj);
        else
        	throw new IllegalArgumentException("HwBusClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("641511a8-d3d4-44cd-871e-e69c163fb882")
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
    @objid ("cd795913-90ed-4368-be81-14d81c156637")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Classifier_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dc72fb14-2a89-4247-9205-c364ff4bda1a")
    public String getHwBus_Classifier_adressWidth() {
        return this.elt.getTagValue(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Classifier_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5237639b-1409-4be6-a3d9-f9d07545c1c1")
    public String getHwBus_Classifier_wordWidth() {
        return this.elt.getTagValue(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_WORDWIDTH_TAGTYPE_ELT);
    }

    @objid ("6346ad9a-9da4-4643-a0f7-98889e70411b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Classifier_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("043f0bba-3cfe-416b-aeeb-ed454aa99bdb")
    public boolean isHwBus_Classifier_isSerial() {
        return this.elt.isTagged(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Classifier_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7bb46463-31fc-4ae1-9086-3a2b7edc64f2")
    public boolean isHwBus_Classifier_isSynchronous() {
        return this.elt.isTagged(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Classifier_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18b897ec-9454-4649-8f81-e82fa5833fae")
    public void setHwBus_Classifier_adressWidth(final String value) {
        this.elt.putTagValue(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Classifier_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd196c75-f25d-4ad0-8ddb-b5cad12b05a5")
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
    @objid ("222964b6-5b28-4f79-8019-e426bdc7ef67")
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
    @objid ("7c29c60e-39ab-4ca5-b041-336c33f216e7")
    public void setHwBus_Classifier_wordWidth(final String value) {
        this.elt.putTagValue(HwBusClassifier.MdaTypes.HWBUS_CLASSIFIER_WORDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("6c1bfd05-5c49-4a6a-9d59-d4c194e81180")
    protected HwBusClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("cfd24ae8-42a9-4f99-936b-2fc6972f3c25")
    public static final class MdaTypes {
        @objid ("4b57239d-1efd-48e2-9227-76415b26ea55")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f058a15c-a48b-44a5-9e62-dbdbfcd4584f")
        public static TagType HWBUS_CLASSIFIER_ADRESSWIDTH_TAGTYPE_ELT;

        @objid ("c4297566-6025-490e-84da-025583954335")
        public static TagType HWBUS_CLASSIFIER_WORDWIDTH_TAGTYPE_ELT;

        @objid ("a12d168a-7931-4c09-b5ab-522ca8f3e5e6")
        public static TagType HWBUS_CLASSIFIER_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("cfc83313-b16d-40b2-9caa-3e4432eaf82c")
        public static TagType HWBUS_CLASSIFIER_ISSERIAL_TAGTYPE_ELT;

        @objid ("6a1e8577-56b5-4a5d-9b48-07a8f1711c5b")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ef50706-4009-4463-be42-22554e4268ed")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("97a3c557-1f44-427d-bafe-effa96c94c1f")
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
