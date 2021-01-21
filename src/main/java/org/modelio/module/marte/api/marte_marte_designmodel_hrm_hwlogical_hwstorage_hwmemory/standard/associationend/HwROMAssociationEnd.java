/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwROM_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("94e4c527-898c-4048-b90e-41ce125fc52e")
public class HwROMAssociationEnd extends HwMemoryAssociationEnd {
    @objid ("b506ae3c-cc93-404e-80ef-cfeb3307acd1")
    public static final String STEREOTYPE_NAME = "HwROM_AssociationEnd";

    @objid ("f7ae3f46-dcd6-4db3-b7bc-0a46a8b90bfb")
    public static final String HWROM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE = "HwROM_AssociationEnd_organization";

    @objid ("10b87dc2-6a6b-42b4-92c6-5792f62c095a")
    public static final String HWROM_ASSOCIATIONEND_TYPE_TAGTYPE = "HwROM_AssociationEnd_type";

    /**
     * Tells whether a {@link HwROMAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwROM_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8a809073-8a67-4444-b57c-44f924e9bea3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwROM_AssociationEnd >> then instantiate a {@link HwROMAssociationEnd} proxy.
     * 
     * @return a {@link HwROMAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("b7025c4a-d10f-404c-bb9c-a2338a2c2615")
    public static HwROMAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMAssociationEnd.STEREOTYPE_NAME);
        return HwROMAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwROMAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwROM_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwROMAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("86915c92-f08e-490f-89d6-a2af343feef9")
    public static HwROMAssociationEnd instantiate(final AssociationEnd obj) {
        return HwROMAssociationEnd.canInstantiate(obj) ? new HwROMAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwROMAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwROM_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwROMAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d01683e5-247a-406b-9f23-3797c52c6265")
    public static HwROMAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwROMAssociationEnd.canInstantiate(obj))
        	return new HwROMAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwROMAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("29dc4dd6-00b5-48b2-af78-a241a34f9bff")
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
        HwROMAssociationEnd other = (HwROMAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("471514cf-89cf-4c1b-9fc7-2130a6f09d06")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ae57de3f-49f5-421b-81bd-f5b5eacdaf83")
    public String getHwROM_AssociationEnd_organization() {
        return this.elt.getTagValue(HwROMAssociationEnd.MdaTypes.HWROM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79b8f4b0-0cf7-4a5a-a396-32c7f7b8a543")
    public String getHwROM_AssociationEnd_type() {
        return this.elt.getTagValue(HwROMAssociationEnd.MdaTypes.HWROM_ASSOCIATIONEND_TYPE_TAGTYPE_ELT);
    }

    @objid ("a89934d5-e516-4a4d-94bf-d9e7ccbe8ee2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_AssociationEnd_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fdaacccd-e6e8-40bf-85b4-436e33c56ef4")
    public void setHwROM_AssociationEnd_organization(final String value) {
        this.elt.putTagValue(HwROMAssociationEnd.MdaTypes.HWROM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_AssociationEnd_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8e11cdd7-aa8e-4e5e-b4f6-0bb9782e946c")
    public void setHwROM_AssociationEnd_type(final String value) {
        this.elt.putTagValue(HwROMAssociationEnd.MdaTypes.HWROM_ASSOCIATIONEND_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("3f0c0633-9adc-4dd1-8987-620ce2edde48")
    protected HwROMAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("ef237d62-f757-4a08-929d-b590da496120")
    public static final class MdaTypes {
        @objid ("068fd0f1-4abe-41d9-b1fe-415c91f48231")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("513b7b50-9dc8-4e83-9217-2332f4560907")
        public static TagType HWROM_ASSOCIATIONEND_TYPE_TAGTYPE_ELT;

        @objid ("a0c62c51-562c-4ac1-9a72-b0abee268653")
        public static TagType HWROM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT;

        @objid ("c6b5dd1e-0add-4b41-8026-868c2382617d")
        private static Stereotype MDAASSOCDEP;

        @objid ("d729a425-3370-45d4-8aeb-c9ef43596a0c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f42aab0f-a8f6-4cd6-8e24-fdf6be48f9e1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01678c5a-0ccf-11df-8525-001302895b2b");
            HWROM_ASSOCIATIONEND_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0169eeae-0ccf-11df-8525-001302895b2b");
            HWROM_ASSOCIATIONEND_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0169eeb5-0ccf-11df-8525-001302895b2b");
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
