/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.attribute;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwROM_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b4f270f5-3630-4eac-9654-62e3b18c55cd")
public class HwROMAttribute extends HwMemoryAttribute {
    @objid ("f5535db5-8c6b-47d9-b80b-9734f042f20d")
    public static final String STEREOTYPE_NAME = "HwROM_Attribute";

    @objid ("31bad3e4-19ba-4976-a832-6862021c878d")
    public static final String HWROM_ATTRIBUTE_ORGANIZATION_TAGTYPE = "HwROM_Attribute_organization";

    @objid ("6292e6a8-79f2-473c-a7d6-1cedbaf0d7a5")
    public static final String HWROM_ATTRIBUTE_TYPE_TAGTYPE = "HwROM_Attribute_type";

    /**
     * Tells whether a {@link HwROMAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwROM_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("30a68589-cad2-4a3d-b55c-5ee698d8fdd1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwROM_Attribute >> then instantiate a {@link HwROMAttribute} proxy.
     * 
     * @return a {@link HwROMAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("28946ab8-7cd8-42f2-b249-e6f9f447f685")
    public static HwROMAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMAttribute.STEREOTYPE_NAME);
        return HwROMAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwROMAttribute} proxy from a {@link Attribute} stereotyped << HwROM_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwROMAttribute} proxy or <i>null</i>.
     */
    @objid ("cef9464e-5ed9-43b9-a1c7-d4afe49e029b")
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
    @objid ("36a2dbb3-316a-49d2-8f7e-a61b651c7cf0")
    public static HwROMAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwROMAttribute.canInstantiate(obj))
        	return new HwROMAttribute(obj);
        else
        	throw new IllegalArgumentException("HwROMAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c5a521ac-f355-49ff-8fc6-5ebdd53d35cf")
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
    @objid ("a82d40d0-4a00-4a18-9841-d0dc508830d9")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Attribute_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a16076a9-e727-4333-bf2d-d2cc99520fd6")
    public String getHwROM_Attribute_organization() {
        return this.elt.getTagValue(HwROMAttribute.MdaTypes.HWROM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("05eb3f3f-70e3-45bb-89de-b793b52f0700")
    public String getHwROM_Attribute_type() {
        return this.elt.getTagValue(HwROMAttribute.MdaTypes.HWROM_ATTRIBUTE_TYPE_TAGTYPE_ELT);
    }

    @objid ("dde62ee9-f783-4d6d-9cb8-3d7439cd5db7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Attribute_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("800a1cb4-76ce-4cc3-ad75-75aedef8040e")
    public void setHwROM_Attribute_organization(final String value) {
        this.elt.putTagValue(HwROMAttribute.MdaTypes.HWROM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Attribute_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("114c1f53-6a63-4d8a-816a-24e9a1e8fb53")
    public void setHwROM_Attribute_type(final String value) {
        this.elt.putTagValue(HwROMAttribute.MdaTypes.HWROM_ATTRIBUTE_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("ac694e9a-6ba6-448e-b841-fd1cb84c0305")
    protected HwROMAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("3d521cd0-948e-41e9-ba38-34d1bc05ea28")
    public static final class MdaTypes {
        @objid ("5e5a37bd-7d99-40ca-935c-209b40bfb1fa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4181e083-9048-4528-ae4f-f2258fb086a5")
        public static TagType HWROM_ATTRIBUTE_TYPE_TAGTYPE_ELT;

        @objid ("ff9a1e37-1088-4db5-828d-f027419b7b26")
        public static TagType HWROM_ATTRIBUTE_ORGANIZATION_TAGTYPE_ELT;

        @objid ("e7d1b6a9-d3f2-45d5-8e96-3cc3d7e6f8f5")
        private static Stereotype MDAASSOCDEP;

        @objid ("d533f8e7-a1ff-4083-8f2a-be9c92bfe73e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a318e13e-1574-48b3-9283-8d715fdfc6aa")
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
