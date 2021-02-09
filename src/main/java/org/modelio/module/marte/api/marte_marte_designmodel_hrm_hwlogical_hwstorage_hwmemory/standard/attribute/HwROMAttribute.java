/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwROM_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwROMAttribute extends HwMemoryAttribute {
    public static final String STEREOTYPE_NAME = "HwROM_Attribute";

    public static final String HWROM_ATTRIBUTE_ORGANIZATION_TAGTYPE = "HwROM_Attribute_organization";

    public static final String HWROM_ATTRIBUTE_TYPE_TAGTYPE = "HwROM_Attribute_type";

    /**
     * Tells whether a {@link HwROMAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwROM_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwROM_Attribute >> then instantiate a {@link HwROMAttribute} proxy.
     * 
     * @return a {@link HwROMAttribute} proxy on the created {@link Attribute}.
     */
    public static HwROMAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMAttribute.STEREOTYPE_NAME);
        return HwROMAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwROMAttribute} proxy from a {@link Attribute} stereotyped << HwROM_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwROMAttribute} proxy or <i>null</i>.
     */
    public static HwROMAttribute instantiate(final Attribute obj) {
        return HwROMAttribute.canInstantiate(obj) ? new HwROMAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwROMAttribute} proxy from a {@link Attribute} stereotyped << HwROM_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwROMAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwROMAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwROMAttribute.canInstantiate(obj))
        	return new HwROMAttribute(obj);
        else
        	throw new IllegalArgumentException("HwROMAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        HwROMAttribute other = (HwROMAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Attribute_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwROM_Attribute_organization() {
        return this.elt.getTagValue(HwROMAttribute.MdaTypes.HWROM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwROM_Attribute_type() {
        return this.elt.getTagValue(HwROMAttribute.MdaTypes.HWROM_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Attribute_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwROM_Attribute_organization(final String value) {
        this.elt.putTagValue(HwROMAttribute.MdaTypes.HWROM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwROM_Attribute_type(final String value) {
        this.elt.putTagValue(HwROMAttribute.MdaTypes.HWROM_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    protected HwROMAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWROM_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        public static TagType HWROM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01678c5c-0ccf-11df-8525-001302895b2b");
            HWROM_ATTRIBUTE_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0169eeb0-0ccf-11df-8525-001302895b2b");
            HWROM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0169eeb7-0ccf-11df-8525-001302895b2b");
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
