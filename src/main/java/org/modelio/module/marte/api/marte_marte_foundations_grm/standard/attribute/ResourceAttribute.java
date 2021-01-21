/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Attribute} with << Resource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8b1447c5-7e59-428c-8b91-f6919eb33fd8")
public class ResourceAttribute {
    @objid ("4e6e40a5-b59d-4b4a-9496-3ca50acfc54f")
    public static final String STEREOTYPE_NAME = "Resource_Attribute";

    @objid ("2219f600-6970-4c75-b459-f9cc436adb51")
    public static final String RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE = "Resource_Attribute_isActive";

    @objid ("86696e11-5411-4b96-9a4c-eebb18cef20d")
    public static final String RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE = "Resource_Attribute_isProtected";

    @objid ("c6caae6a-539d-4a15-888b-dbb459d30679")
    public static final String RESOURCE_ATTRIBUTE_RESMULT_TAGTYPE = "Resource_Attribute_resMult";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("6e3ce838-a026-4d2a-aebd-a0a37560533e")
    protected final Attribute elt;

    /**
     * Tells whether a {@link ResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Resource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b6a5def5-67fd-4951-a2df-04a2a33d3b70")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Resource_Attribute >> then instantiate a {@link ResourceAttribute} proxy.
     * 
     * @return a {@link ResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("28629db5-d20d-4fd2-b9b9-ea5cf6fbbec6")
    public static ResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceAttribute.STEREOTYPE_NAME);
        return ResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link ResourceAttribute} proxy from a {@link Attribute} stereotyped << Resource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link ResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("00a353f5-2c0f-450a-abe5-467f2e447e51")
    public static ResourceAttribute instantiate(final Attribute obj) {
        return ResourceAttribute.canInstantiate(obj) ? new ResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceAttribute} proxy from a {@link Attribute} stereotyped << Resource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link ResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0fe80a89-c79b-4a07-8b66-21f7bff19c98")
    public static ResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (ResourceAttribute.canInstantiate(obj))
        	return new ResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("ResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("008cae7e-47da-4496-be56-8c88c2eccf06")
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
        ResourceAttribute other = (ResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("28734a27-8c6c-4327-9fcc-7762fe078565")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Attribute_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4fbf8f7b-e056-4c38-85d2-8c8a813bc181")
    public String getResource_Attribute_resMult() {
        return this.elt.getTagValue(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_RESMULT_TAGTYPE_ELT);
    }

    @objid ("6bf8e68a-5ace-4c5a-b039-e9cafd91cd40")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Attribute_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6bbb6f6e-0d40-418a-8582-226cce961e65")
    public boolean isResource_Attribute_isActive() {
        return this.elt.isTagged(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Attribute_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("71775a1a-d874-49b3-aece-0dc9471d4017")
    public boolean isResource_Attribute_isProtected() {
        return this.elt.isTagged(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Attribute_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e665b317-a726-4c05-8e50-4d861bc7630b")
    public void setResource_Attribute_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Attribute_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("18627ba5-0f01-480e-b8bb-f2aadc7f0604")
    public void setResource_Attribute_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Attribute_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5bcf3448-312d-40c4-8b45-c00af25c3093")
    public void setResource_Attribute_resMult(final String value) {
        this.elt.putTagValue(ResourceAttribute.MdaTypes.RESOURCE_ATTRIBUTE_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("10374860-40a3-4ba2-b0a6-f79220c7d370")
    protected ResourceAttribute(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("8197c91a-aa13-4386-be80-3702dea53436")
    public static final class MdaTypes {
        @objid ("a4f0a176-1318-41af-90a4-abfc28af51e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3b686b11-ea79-4b60-bd13-5d75467ad2f8")
        public static TagType RESOURCE_ATTRIBUTE_RESMULT_TAGTYPE_ELT;

        @objid ("cac670f6-d2e8-4a34-918a-ad82689c70fe")
        public static TagType RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE_ELT;

        @objid ("5cf610d3-5cf3-4ef2-8533-07c89813dc5e")
        public static TagType RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE_ELT;

        @objid ("7b560ad7-714e-4db6-9435-ebdee3f32463")
        private static Stereotype MDAASSOCDEP;

        @objid ("b551387d-d01f-43a8-ac4c-28b892787e37")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("02026f24-1a1a-4013-bb38-07cfb6d03e2c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ff9dcee0-0cce-11df-8525-001302895b2b");
            RESOURCE_ATTRIBUTE_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa0312e-0cce-11df-8525-001302895b2b");
            RESOURCE_ATTRIBUTE_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa29383-0cce-11df-8525-001302895b2b");
            RESOURCE_ATTRIBUTE_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa2938a-0cce-11df-8525-001302895b2b");
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
