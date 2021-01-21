/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwBus_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("84cc6552-db84-4c90-aa29-d9d679d38402")
public class HwBusParameter extends HwMediaParameter {
    @objid ("b8e1a36d-c088-46fe-be62-2857c49c3ab9")
    public static final String STEREOTYPE_NAME = "HwBus_Parameter";

    @objid ("36812336-6cc9-42ad-8b8f-d3429b0da01c")
    public static final String HWBUS_PARAMETER_ADRESSWIDTH_TAGTYPE = "HwBus_Parameter_adressWidth";

    @objid ("beafbd3d-8140-4e7e-891b-c443cb2c7853")
    public static final String HWBUS_PARAMETER_ISSERIAL_TAGTYPE = "HwBus_Parameter_isSerial";

    @objid ("ef931f4f-aea6-4e9c-ae80-f3ca153f6654")
    public static final String HWBUS_PARAMETER_ISSYNCHRONOUS_TAGTYPE = "HwBus_Parameter_isSynchronous";

    @objid ("110c9ffb-e6bb-4dcb-af01-649e37b14163")
    public static final String HWBUS_PARAMETER_WORDWIDTH_TAGTYPE = "HwBus_Parameter_wordWidth";

    /**
     * Tells whether a {@link HwBusParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwBus_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("51eb9d1e-b829-41ce-83cf-5eec3ad4c754")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwBus_Parameter >> then instantiate a {@link HwBusParameter} proxy.
     * 
     * @return a {@link HwBusParameter} proxy on the created {@link Parameter}.
     */
    @objid ("47dad297-4c30-4258-9506-94dc34f42f4f")
    public static HwBusParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusParameter.STEREOTYPE_NAME);
        return HwBusParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwBusParameter} proxy from a {@link Parameter} stereotyped << HwBus_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwBusParameter} proxy or <i>null</i>.
     */
    @objid ("3e75f1c0-9b95-4dcc-a269-1858ebd3c522")
    public static HwBusParameter instantiate(final Parameter obj) {
        return HwBusParameter.canInstantiate(obj) ? new HwBusParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBusParameter} proxy from a {@link Parameter} stereotyped << HwBus_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwBusParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7454c047-5899-4f09-a437-9b45f04184ed")
    public static HwBusParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwBusParameter.canInstantiate(obj))
        	return new HwBusParameter(obj);
        else
        	throw new IllegalArgumentException("HwBusParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7c792af6-504c-4665-8551-b975678c4390")
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
        HwBusParameter other = (HwBusParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("39c3057a-7d28-4a1c-ad73-58e06cdc206a")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Parameter_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ee8b27a6-ed04-447e-b12e-1aca66ce9c9f")
    public String getHwBus_Parameter_adressWidth() {
        return this.elt.getTagValue(HwBusParameter.MdaTypes.HWBUS_PARAMETER_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Parameter_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c9165312-ca8a-40b9-a4dd-2fbbb603a94c")
    public String getHwBus_Parameter_wordWidth() {
        return this.elt.getTagValue(HwBusParameter.MdaTypes.HWBUS_PARAMETER_WORDWIDTH_TAGTYPE_ELT);
    }

    @objid ("aa31ddab-4ce0-4cad-8e86-f5f64fe4f820")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Parameter_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("57c476d3-c079-4f90-9f06-0be9182c38aa")
    public boolean isHwBus_Parameter_isSerial() {
        return this.elt.isTagged(HwBusParameter.MdaTypes.HWBUS_PARAMETER_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Parameter_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b68ffde-9a97-4160-aadb-ba6295b4390f")
    public boolean isHwBus_Parameter_isSynchronous() {
        return this.elt.isTagged(HwBusParameter.MdaTypes.HWBUS_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Parameter_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("97290f76-0ee6-4bf3-9112-5b9a837750ae")
    public void setHwBus_Parameter_adressWidth(final String value) {
        this.elt.putTagValue(HwBusParameter.MdaTypes.HWBUS_PARAMETER_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Parameter_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("599c3a44-68dc-4ed3-9632-9e276f77d364")
    public void setHwBus_Parameter_isSerial(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusParameter.MdaTypes.HWBUS_PARAMETER_ISSERIAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusParameter.MdaTypes.HWBUS_PARAMETER_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwBus_Parameter_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4af3ab74-7d79-48e1-9c7d-9f4e67c4b2ac")
    public void setHwBus_Parameter_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusParameter.MdaTypes.HWBUS_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusParameter.MdaTypes.HWBUS_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Parameter_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bfb6bf3e-256b-4b1d-a680-b5e1a23d172f")
    public void setHwBus_Parameter_wordWidth(final String value) {
        this.elt.putTagValue(HwBusParameter.MdaTypes.HWBUS_PARAMETER_WORDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("13f19059-b102-4fb9-9151-38da06b98756")
    protected HwBusParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("07580a63-e29f-4836-92ac-dd6f75a9f8f4")
    public static final class MdaTypes {
        @objid ("1f35be04-fba9-4c05-a33b-d39e9b621fa5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c7f2b242-ad33-482d-9539-dcedaf1099d3")
        public static TagType HWBUS_PARAMETER_ADRESSWIDTH_TAGTYPE_ELT;

        @objid ("a0c57afb-2aeb-483d-80eb-a190fd2767d4")
        public static TagType HWBUS_PARAMETER_WORDWIDTH_TAGTYPE_ELT;

        @objid ("7e79301f-e927-4399-a3a1-d405f848f65d")
        public static TagType HWBUS_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("4880dc83-a7f3-4c36-9c5e-649324b20268")
        public static TagType HWBUS_PARAMETER_ISSERIAL_TAGTYPE_ELT;

        @objid ("9a0c2881-9ac2-41f6-a620-302ee522434e")
        private static Stereotype MDAASSOCDEP;

        @objid ("6bec7483-c146-41e0-a068-47c7ff3ea08e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8458e0cd-3f89-48e9-ba45-eea265ec8ca9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01167d76-0ccf-11df-8525-001302895b2b");
            HWBUS_PARAMETER_ADRESSWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d7d-0ccf-11df-8525-001302895b2b");
            HWBUS_PARAMETER_WORDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d84-0ccf-11df-8525-001302895b2b");
            HWBUS_PARAMETER_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a3b1601-1707-11df-b92a-0014222a9f79");
            HWBUS_PARAMETER_ISSERIAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a3b1602-1707-11df-b92a-0014222a9f79");
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
