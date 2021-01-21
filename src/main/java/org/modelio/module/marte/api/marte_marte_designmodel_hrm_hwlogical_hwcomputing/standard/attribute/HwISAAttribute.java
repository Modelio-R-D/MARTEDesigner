/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.attribute.HwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwISA_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("106060ad-769c-4d32-8bcc-44876252bce2")
public class HwISAAttribute extends HwResourceAttribute {
    @objid ("afa87adc-e094-454d-93c6-7a244dee2945")
    public static final String STEREOTYPE_NAME = "HwISA_Attribute";

    @objid ("6904bb61-eeaf-40f4-9c2b-78c0c3f6e200")
    public static final String HWISA_ATTRIBUTE_FAMILY_TAGTYPE = "HwISA_Attribute_family";

    @objid ("d0005867-ec2d-4ef4-baeb-54750f0d1c50")
    public static final String HWISA_ATTRIBUTE_INST_WIDTH_TAGTYPE = "HwISA_Attribute_inst_Width";

    @objid ("8f653743-94fe-403e-a01e-42436a04367f")
    public static final String HWISA_ATTRIBUTE_TYPE_TAGTYPE = "HwISA_Attribute_type";

    /**
     * Tells whether a {@link HwISAAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwISA_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("efb91137-ad59-4d18-9129-946090991fd5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwISAAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwISA_Attribute >> then instantiate a {@link HwISAAttribute} proxy.
     * 
     * @return a {@link HwISAAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("77e3444b-1192-431e-9125-5ab8a50afad8")
    public static HwISAAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwISAAttribute.STEREOTYPE_NAME);
        return HwISAAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwISAAttribute} proxy from a {@link Attribute} stereotyped << HwISA_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwISAAttribute} proxy or <i>null</i>.
     */
    @objid ("8395e51a-cf20-4fdc-b064-26370c6db14f")
    public static HwISAAttribute instantiate(final Attribute obj) {
        return HwISAAttribute.canInstantiate(obj) ? new HwISAAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwISAAttribute} proxy from a {@link Attribute} stereotyped << HwISA_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwISAAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b6ea1281-307a-4185-a2e3-f3806d48e0d3")
    public static HwISAAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwISAAttribute.canInstantiate(obj))
        	return new HwISAAttribute(obj);
        else
        	throw new IllegalArgumentException("HwISAAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fd9515f0-0370-4779-8081-f898392c0955")
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
        HwISAAttribute other = (HwISAAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("6f51a781-7f45-402a-bf60-2f511effc0d0")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwISA_Attribute_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("301a77fc-a859-420c-834c-db931293a528")
    public String getHwISA_Attribute_family() {
        return this.elt.getTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_FAMILY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Attribute_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6f60e49-6d6a-487e-86f2-62bd7940e3ba")
    public String getHwISA_Attribute_inst_Width() {
        return this.elt.getTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_INST_WIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwISA_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("96272902-7604-449e-a589-dac3dfa7c889")
    public String getHwISA_Attribute_type() {
        return this.elt.getTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    @objid ("07ec5658-ae7d-43f6-8b6a-40191238b6be")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwISA_Attribute_family'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d60bbf9e-0496-46d2-8022-61725c17fb20")
    public void setHwISA_Attribute_family(final String value) {
        this.elt.putTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_FAMILY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Attribute_inst_Width'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c1a33aa-fe3c-4901-9dda-27f8205e3784")
    public void setHwISA_Attribute_inst_Width(final String value) {
        this.elt.putTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_INST_WIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwISA_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a08ff80d-c404-4712-b83e-41d559afb294")
    public void setHwISA_Attribute_type(final String value) {
        this.elt.putTagValue(HwISAAttribute.MdaTypes.HWISA_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("1d20b713-f1ea-482d-b8e5-274d3a7035f1")
    protected HwISAAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("ae4d7dc8-ae90-48a9-bac4-f56befb05793")
    public static final class MdaTypes {
        @objid ("44e2ff30-f02e-4af7-b0b9-b1fa38c9dcd3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("425adc30-a3b1-4f36-a1d0-295eed697316")
        public static TagType HWISA_ATTRIBUTE_FAMILY_TAGTYPE_ELT;

        @objid ("d79dba12-e1a0-4640-9e71-13c2fa96216e")
        public static TagType HWISA_ATTRIBUTE_INST_WIDTH_TAGTYPE_ELT;

        @objid ("fbeb6028-b489-4daa-98bf-8db16d5490eb")
        public static TagType HWISA_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        @objid ("bd0fef1b-e31e-4f85-8eb9-a7a5409aee87")
        private static Stereotype MDAASSOCDEP;

        @objid ("e48a6832-898a-4409-8388-8802974f9a82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bd48c45c-168e-4d67-bc03-dac5bf6f97b6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00f77f4f-0ccf-11df-8525-001302895b2b");
            HWISA_ATTRIBUTE_FAMILY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f56-0ccf-11df-8525-001302895b2b");
            HWISA_ATTRIBUTE_INST_WIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f5d-0ccf-11df-8525-001302895b2b");
            HWISA_ATTRIBUTE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00f77f64-0ccf-11df-8525-001302895b2b");
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
