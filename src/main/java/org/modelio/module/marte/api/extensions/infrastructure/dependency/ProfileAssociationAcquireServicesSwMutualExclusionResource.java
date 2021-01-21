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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_acquireServices_SwMutualExclusionResource >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("72107943-805d-45a2-bff2-8ea81ee33226")
public class ProfileAssociationAcquireServicesSwMutualExclusionResource {
    @objid ("f081e84b-4066-453c-be4c-a77c85610b5b")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_acquireServices_SwMutualExclusionResource";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("7be7335b-e0ba-4b26-9442-a85e1e779c07")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationAcquireServicesSwMutualExclusionResource proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_acquireServices_SwMutualExclusionResource >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("631e6c0b-2fcd-4352-b576-5d4e165f7d18")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationAcquireServicesSwMutualExclusionResource.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_acquireServices_SwMutualExclusionResource >> then instantiate a {@link ProfileAssociationAcquireServicesSwMutualExclusionResource} proxy.
     * 
     * @return a {@link ProfileAssociationAcquireServicesSwMutualExclusionResource} proxy on the created {@link Dependency}.
     */
    @objid ("1618f6e2-3384-4610-9d51-5e68021d3b63")
    public static ProfileAssociationAcquireServicesSwMutualExclusionResource create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationAcquireServicesSwMutualExclusionResource.STEREOTYPE_NAME);
        return ProfileAssociationAcquireServicesSwMutualExclusionResource.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationAcquireServicesSwMutualExclusionResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_acquireServices_SwMutualExclusionResource >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationAcquireServicesSwMutualExclusionResource} proxy or <i>null</i>.
     */
    @objid ("31ff4f39-140a-46f0-936b-9f9c3873a82f")
    public static ProfileAssociationAcquireServicesSwMutualExclusionResource instantiate(final Dependency obj) {
        return ProfileAssociationAcquireServicesSwMutualExclusionResource.canInstantiate(obj) ? new ProfileAssociationAcquireServicesSwMutualExclusionResource(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationAcquireServicesSwMutualExclusionResource} proxy from a {@link Dependency} stereotyped << ProfileAssociation_acquireServices_SwMutualExclusionResource >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationAcquireServicesSwMutualExclusionResource} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("19cbdb1d-1240-4221-a4c1-67122ed8f360")
    public static ProfileAssociationAcquireServicesSwMutualExclusionResource safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationAcquireServicesSwMutualExclusionResource.canInstantiate(obj))
        	return new ProfileAssociationAcquireServicesSwMutualExclusionResource(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationAcquireServicesSwMutualExclusionResource: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8767787f-735c-42d2-a280-af1dba67a776")
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
        ProfileAssociationAcquireServicesSwMutualExclusionResource other = (ProfileAssociationAcquireServicesSwMutualExclusionResource) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("fde069c9-da05-4376-9e00-f4e999f54721")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a5c0398e-14c3-4136-b832-b6c5fbc13436")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8f38c06f-003b-4672-87cb-85e38f5bc50e")
    protected ProfileAssociationAcquireServicesSwMutualExclusionResource(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("d36d4674-8c5e-486c-8e89-737eb293a228")
    public static final class MdaTypes {
        @objid ("9b4d49fd-d9f8-459e-82c1-0978e66155f4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("29c0ed65-dcac-4f9f-9850-a71c467c8ea7")
        private static Stereotype MDAASSOCDEP;

        @objid ("099c5255-7e9c-4880-b868-547d5988c804")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("adada537-0680-4b51-b50a-2aecb46e771c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "400dc6b5-9759-11e0-94fb-0027103f347c");
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
