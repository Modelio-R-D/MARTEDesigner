/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << Resource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3fb7bd0a-d3ad-4175-b8c5-8ddb95edf7f2")
public class ResourceInstance {
    @objid ("4fa1a1df-f0d8-41f6-ba2b-280a9db22f9a")
    public static final String STEREOTYPE_NAME = "Resource_Instance";

    @objid ("9e5956ef-ca3b-4219-9e64-8d5cf635f27b")
    public static final String RESOURCE_INSTANCE_ISACTIVE_TAGTYPE = "Resource_Instance_isActive";

    @objid ("7d01d71e-35d2-4c69-a696-31368285aded")
    public static final String RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE = "Resource_Instance_isProtected";

    @objid ("ac7397d5-eca9-4d68-92c0-2811e375285d")
    public static final String RESOURCE_INSTANCE_RESMULT_TAGTYPE = "Resource_Instance_resMult";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    @objid ("a95f4a41-2873-4e5d-8c75-396065754138")
    protected final Instance elt;

    /**
     * Tells whether a {@link ResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Resource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("55ce61ee-1034-4bfe-b26f-f96619e41597")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Resource_Instance >> then instantiate a {@link ResourceInstance} proxy.
     * 
     * @return a {@link ResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("a832f8db-0bca-47b5-b490-91c9f340a811")
    public static ResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceInstance.STEREOTYPE_NAME);
        return ResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ResourceInstance} proxy from a {@link Instance} stereotyped << Resource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ResourceInstance} proxy or <i>null</i>.
     */
    @objid ("63324850-667d-4223-9ec3-ea88f60de060")
    public static ResourceInstance instantiate(final Instance obj) {
        return ResourceInstance.canInstantiate(obj) ? new ResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceInstance} proxy from a {@link Instance} stereotyped << Resource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3c26d59b-6047-4b78-b58f-352b20092a98")
    public static ResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ResourceInstance.canInstantiate(obj))
        	return new ResourceInstance(obj);
        else
        	throw new IllegalArgumentException("ResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("62f6d8e0-4320-43bc-8337-8b7ad81a789d")
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
        ResourceInstance other = (ResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("47e63892-126a-42f4-bbb2-7064423d75b6")
    public Instance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Instance_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d3804e3-e5bc-44b0-9290-24066558880a")
    public String getResource_Instance_resMult() {
        return this.elt.getTagValue(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT);
    }

    @objid ("1ed85af2-f29c-4fe2-9a70-fdb70c85ebfc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Instance_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1b57fc0-921e-4b22-b167-d28f1d565c98")
    public boolean isResource_Instance_isActive() {
        return this.elt.isTagged(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Instance_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4fd471d0-59d3-48a1-bb4c-b9bb5830fa98")
    public boolean isResource_Instance_isProtected() {
        return this.elt.isTagged(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Instance_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c67c899c-c256-4f05-9552-0d476d8c0be6")
    public void setResource_Instance_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Instance_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9b832e97-9b04-4d75-9b4e-f7bf89383e03")
    public void setResource_Instance_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Instance_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be2e5b51-80bf-49fe-976b-745ab192e115")
    public void setResource_Instance_resMult(final String value) {
        this.elt.putTagValue(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("ffb80086-408a-4692-842a-252dec5c4dff")
    protected ResourceInstance(final Instance elt) {
        this.elt = elt;
    }

    @objid ("083fe16e-5f8e-4283-843f-d3593333554a")
    public static final class MdaTypes {
        @objid ("7a311db5-ca6c-4a8a-9426-be81c0fa9157")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c8affb9-8017-4a72-8c6c-cf281718afe7")
        public static TagType RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT;

        @objid ("ab6e459a-aeb5-46fb-98a9-e0691a42754e")
        public static TagType RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT;

        @objid ("0e3ae554-1164-4b1b-8147-daa20015a3e9")
        public static TagType RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT;

        @objid ("5ba523bf-8907-4785-9d13-c57bf457a9c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("21b15f4f-7a62-4572-b907-41a1ce112a34")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d04c823-6e4b-4f88-9ee4-a605ed86a36a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ff9dcee3-0cce-11df-8525-001302895b2b");
            RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa2937f-0cce-11df-8525-001302895b2b");
            RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa29386-0cce-11df-8525-001302895b2b");
            RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa2938d-0cce-11df-8525-001302895b2b");
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
