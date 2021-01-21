/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_resumeServices_SwConcurrentResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ed345d45-eff5-4f42-b98d-41a364c41866")
public class ProfileAssociationResumeServicesSwConcurrentResource {
    @objid ("fc2cfda8-d947-4e34-a277-a71adb028e25")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_resumeServices_SwConcurrentResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("8e5fcd73-aa73-4a79-a1e8-ece15e7f57c5")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationResumeServicesSwConcurrentResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_resumeServices_SwConcurrentResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("49bc439d-9ace-4d32-84f8-797fd9d1150f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationResumeServicesSwConcurrentResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_resumeServices_SwConcurrentResource >> then instantiate a {@link ProfileAssociationResumeServicesSwConcurrentResource} proxy.
     * 
     * @return a {@link ProfileAssociationResumeServicesSwConcurrentResource} proxy on the created {@link Dependency}.
     */
    @objid ("95b25901-c0c9-4371-8206-9bd6c6b5858d")
    public static ProfileAssociationResumeServicesSwConcurrentResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationResumeServicesSwConcurrentResource.STEREOTYPE_NAME);
        return ProfileAssociationResumeServicesSwConcurrentResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationResumeServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_resumeServices_SwConcurrentResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationResumeServicesSwConcurrentResource} proxy or <i>null</i>.
     */
    @objid ("b8a67742-7521-4bd7-91e1-739d75d9e65c")
    public static ProfileAssociationResumeServicesSwConcurrentResource instantiate(final Dependency obj) {
        return ProfileAssociationResumeServicesSwConcurrentResource.canInstantiate(obj) ? new ProfileAssociationResumeServicesSwConcurrentResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationResumeServicesSwConcurrentResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_resumeServices_SwConcurrentResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationResumeServicesSwConcurrentResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("feb37a78-c678-41f8-99c3-2296edc84cd4")
    public static ProfileAssociationResumeServicesSwConcurrentResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationResumeServicesSwConcurrentResource.canInstantiate(obj))
        	return new ProfileAssociationResumeServicesSwConcurrentResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationResumeServicesSwConcurrentResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8cbdbe67-2550-4668-8351-5a13df86bc86")
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
        ProfileAssociationResumeServicesSwConcurrentResource other = (ProfileAssociationResumeServicesSwConcurrentResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("b3ef8e78-e761-4a13-ad62-edd96c97e5d8")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("120e64f6-f622-4c14-91a8-923ef32861f4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f7d17196-28b7-49d8-82a2-5b64c26a1dac")
    protected ProfileAssociationResumeServicesSwConcurrentResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("c8953b95-74e7-4754-b810-476a344bdefb")
    public static final class MdaTypes {
        @objid ("398d129d-bade-4d9c-945d-fa8acff390ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9dd1a969-3e93-4bc9-9318-283730f4f176")
        private static Stereotype MDAASSOCDEP;

        @objid ("7a49d868-3213-48b8-a1e4-6827345040c3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ccecf6ff-6daa-46ee-82a4-7b0f99216c68")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8d55e9a8-9756-11e0-94fb-0027103f347c");
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
