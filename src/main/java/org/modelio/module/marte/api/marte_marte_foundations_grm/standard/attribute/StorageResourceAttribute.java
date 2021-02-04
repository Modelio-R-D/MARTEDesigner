/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute;

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
 * Proxy class to handle a {@link Attribute} with << StorageResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("02517595-5f62-455f-8415-2b7c20cc72b5")
public class StorageResourceAttribute extends ResourceAttribute {
    @objid ("55d66849-01b1-40d5-a21d-28b93282a859")
    public static final String STEREOTYPE_NAME = "StorageResource_Attribute";

    @objid ("1e40daf2-b42d-4dbd-8062-884dd9e14a5c")
    public static final String STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE = "StorageResource_Attribute_elementSize";

    /**
     * Tells whether a {@link StorageResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << StorageResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dc97c80b-efd0-46ed-bf7a-c62b73d2ab93")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << StorageResource_Attribute >> then instantiate a {@link StorageResourceAttribute} proxy.
     * 
     * @return a {@link StorageResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("accb01a7-64aa-4270-bd1e-b01d5b3c75ce")
    public static StorageResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, StorageResourceAttribute.STEREOTYPE_NAME);
        return StorageResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link StorageResourceAttribute} proxy from a {@link Attribute} stereotyped << StorageResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link StorageResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("6bda14a9-35f0-4b08-aa30-0c3d579730f5")
    public static StorageResourceAttribute instantiate(final Attribute obj) {
        return StorageResourceAttribute.canInstantiate(obj) ? new StorageResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link StorageResourceAttribute} proxy from a {@link Attribute} stereotyped << StorageResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link StorageResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b9c5f324-975b-47b3-84c4-7d5a2d8c11d0")
    public static StorageResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (StorageResourceAttribute.canInstantiate(obj))
        	return new StorageResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("StorageResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ea0ea54d-1e67-4c52-8bba-95ef76cb6b15")
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
        StorageResourceAttribute other = (StorageResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("c4fe1b95-6939-4aee-9a1c-fd9510c7e062")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'StorageResource_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("387fdf40-8810-4182-9606-70f39b8b72e4")
    public String getStorageResource_Attribute_elementSize() {
        return this.elt.getTagValue(StorageResourceAttribute.MdaTypes.STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT);
    }

    @objid ("612bb161-5301-4526-b218-6ed002b961e0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'StorageResource_Attribute_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ebad0836-4722-4b9c-838d-b7e0ce4edd55")
    public void setStorageResource_Attribute_elementSize(final String value) {
        this.elt.putTagValue(StorageResourceAttribute.MdaTypes.STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    @objid ("b35c55dd-908e-4112-aaca-361efe970a6f")
    protected StorageResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("fb406d2d-1904-46ff-a1c2-21fdcb44f08e")
    public static final class MdaTypes {
        @objid ("7df93662-b53e-4d83-a13e-a18bcf87b969")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5fb7bfb8-554b-4b67-a7e1-1c1dff02bf77")
        public static TagType STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("5707cc49-0ba9-4ef4-94ca-19cfabdf8b54")
        private static Stereotype MDAASSOCDEP;

        @objid ("702a03d2-c6ef-478b-8e37-34c0d18a7417")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f09582b-4598-4ad9-961f-e22f1028bed4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa29391-0cce-11df-8525-001302895b2b");
            STORAGERESOURCE_ATTRIBUTE_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa4f5d2-0cce-11df-8525-001302895b2b");
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
