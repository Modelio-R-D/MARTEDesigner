/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("d594767a-b770-4990-9dc0-ac8152ee305b")
    public static final String STEREOTYPE_NAME = "Resource_Instance";

    @objid ("dc456e4f-d906-4403-82d2-0f90b5cbadf0")
    public static final String RESOURCE_INSTANCE_ISACTIVE_TAGTYPE = "Resource_Instance_isActive";

    @objid ("e0fae5eb-90ae-49be-9ed4-5c0d872293a7")
    public static final String RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE = "Resource_Instance_isProtected";

    @objid ("16e8d505-1382-4e75-90be-e7491456253d")
    public static final String RESOURCE_INSTANCE_RESMULT_TAGTYPE = "Resource_Instance_resMult";

    /**
     * The underlying {@link Instance} represented by this proxy, never null.
     */
    @objid ("d43714e1-a49e-4b8f-853e-efd63f535a3f")
    protected final Instance elt;

    /**
     * Tells whether a {@link ResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << Resource_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4aad2b71-844d-4763-a82a-a57f63dec093")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << Resource_Instance >> then instantiate a {@link ResourceInstance} proxy.
     * 
     * @return a {@link ResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("94b16e2e-86db-401f-9be3-1e4b69dc2060")
    public static ResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceInstance.STEREOTYPE_NAME);
        return ResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ResourceInstance} proxy from a {@link Instance} stereotyped << Resource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ResourceInstance} proxy or <i>null</i>.
     */
    @objid ("ab6e770e-39cf-4d03-a6fc-915e76f092f0")
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
    @objid ("51aaf35f-9276-4d78-ac82-6a91c1964146")
    public static ResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ResourceInstance.canInstantiate(obj))
        	return new ResourceInstance(obj);
        else
        	throw new IllegalArgumentException("ResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0bd4ad14-5b4d-4cbf-8d18-4a98a2f4a12a")
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
    @objid ("d23cd594-855c-4987-be63-61969369e072")
    public Instance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Instance_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dc23860a-688d-4b0c-a3e1-550fb5f028c7")
    public String getResource_Instance_resMult() {
        return this.elt.getTagValue(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT);
    }

    @objid ("c89b71f0-c1a4-471a-98a4-cda6076eb4cd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Instance_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d08f398-ed42-48cd-b696-9cd98d704aa9")
    public boolean isResource_Instance_isActive() {
        return this.elt.isTagged(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Instance_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("388a8b9f-6143-44b4-9e45-4cf7667cdd66")
    public boolean isResource_Instance_isProtected() {
        return this.elt.isTagged(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Instance_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dcea90b5-5bf8-4b73-b6a0-ba06e4581337")
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
    @objid ("5f34c25c-5318-494f-8376-bf81cfd7f5c8")
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
    @objid ("642f40b4-0531-4e3d-a8a6-1c7fd4b4ae89")
    public void setResource_Instance_resMult(final String value) {
        this.elt.putTagValue(ResourceInstance.MdaTypes.RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("a782490d-61aa-4997-85f8-6cb5bce11baf")
    protected ResourceInstance(final Instance elt) {
        this.elt = elt;
    }

    @objid ("083fe16e-5f8e-4283-843f-d3593333554a")
    public static final class MdaTypes {
        @objid ("d1ddff35-618c-4f39-a1c4-4f5e4ae616fd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3f8b6a3e-5fbf-41c0-9d06-c38d792d23f3")
        public static TagType RESOURCE_INSTANCE_RESMULT_TAGTYPE_ELT;

        @objid ("f40bc760-540f-4026-b559-275e862b93d6")
        public static TagType RESOURCE_INSTANCE_ISPROTECTED_TAGTYPE_ELT;

        @objid ("6c4fcdae-17ce-40b3-816b-228b990a46b3")
        public static TagType RESOURCE_INSTANCE_ISACTIVE_TAGTYPE_ELT;

        @objid ("2dea7cc0-6383-4fa3-aa5e-f74d4f2a6b7a")
        private static Stereotype MDAASSOCDEP;

        @objid ("53122480-bcb1-4036-a2d0-0e3295f510b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("53bae211-22c1-4811-bd47-305cefb6633a")
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
