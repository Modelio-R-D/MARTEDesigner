/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_onPort_GCMInvocatingBehavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c34827a8-124b-4b2e-85a6-30aad1422058")
public class ProfileAssociationOnPortGCMInvocatingBehavior {
    @objid ("4b840bb7-f69d-4ee1-9fa4-7a092da1091e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_onPort_GCMInvocatingBehavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("58bce1b2-0114-48ef-82aa-77b30000cc01")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOnPortGCMInvocatingBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_onPort_GCMInvocatingBehavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e2cb7e2d-7222-47ed-ad87-b6c061f944f3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnPortGCMInvocatingBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_onPort_GCMInvocatingBehavior >> then instantiate a {@link ProfileAssociationOnPortGCMInvocatingBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationOnPortGCMInvocatingBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("3eefe588-f560-4448-b880-d3265ff598e9")
    public static ProfileAssociationOnPortGCMInvocatingBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnPortGCMInvocatingBehavior.STEREOTYPE_NAME);
        return ProfileAssociationOnPortGCMInvocatingBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOnPortGCMInvocatingBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_onPort_GCMInvocatingBehavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOnPortGCMInvocatingBehavior} proxy or <i>null</i>.
     */
    @objid ("8fbedf48-ee1f-436c-9f63-9f479ee087d7")
    public static ProfileAssociationOnPortGCMInvocatingBehavior instantiate(final Dependency obj) {
        return ProfileAssociationOnPortGCMInvocatingBehavior.canInstantiate(obj) ? new ProfileAssociationOnPortGCMInvocatingBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOnPortGCMInvocatingBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_onPort_GCMInvocatingBehavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOnPortGCMInvocatingBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("184d198b-5f7d-413e-afba-ef7635e24c10")
    public static ProfileAssociationOnPortGCMInvocatingBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOnPortGCMInvocatingBehavior.canInstantiate(obj))
        	return new ProfileAssociationOnPortGCMInvocatingBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOnPortGCMInvocatingBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d2ff11d-0704-49ab-bb7c-8a2cfd86b3aa")
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
        ProfileAssociationOnPortGCMInvocatingBehavior other = (ProfileAssociationOnPortGCMInvocatingBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("84d4ee41-3e72-4a92-9870-224ff92a2200")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("c6c01125-b13d-45fe-a6ac-f6b344fd117b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("245971e3-1dcb-47f2-a30d-70b64242facc")
    protected ProfileAssociationOnPortGCMInvocatingBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("cee2c97d-0e04-4417-9e24-fe5045961c7c")
    public static final class MdaTypes {
        @objid ("42b2c19a-dc9b-45a9-9673-e456177dff7a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("527b3465-388a-4f78-9f50-af411023bae5")
        private static Stereotype MDAASSOCDEP;

        @objid ("b882f7a0-6205-4381-a341-5ffed0d243df")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1efa4139-d901-4347-bd55-19c57a5afe35")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "12b719ca-a340-11e1-951e-0027103f347d");
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
