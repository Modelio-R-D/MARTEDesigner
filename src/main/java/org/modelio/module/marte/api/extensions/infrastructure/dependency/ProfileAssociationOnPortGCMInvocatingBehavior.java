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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_onPort_GCMInvocatingBehavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c34827a8-124b-4b2e-85a6-30aad1422058")
public class ProfileAssociationOnPortGCMInvocatingBehavior {
    @objid ("09b42b71-f4f9-49c0-a217-0c2139348645")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_onPort_GCMInvocatingBehavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("27abcbe2-c0e3-4eaf-8335-ecdd7da10f3a")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOnPortGCMInvocatingBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_onPort_GCMInvocatingBehavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("098c7d7d-56e5-4a08-a220-a02045802341")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnPortGCMInvocatingBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_onPort_GCMInvocatingBehavior >> then instantiate a {@link ProfileAssociationOnPortGCMInvocatingBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationOnPortGCMInvocatingBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("18c14c52-495d-4efa-a4ec-b073cd4116ec")
    public static ProfileAssociationOnPortGCMInvocatingBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOnPortGCMInvocatingBehavior.STEREOTYPE_NAME);
        return ProfileAssociationOnPortGCMInvocatingBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOnPortGCMInvocatingBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_onPort_GCMInvocatingBehavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOnPortGCMInvocatingBehavior} proxy or <i>null</i>.
     */
    @objid ("43208d8d-b148-4799-8055-dd2da4d1bb6c")
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
    @objid ("13c177d9-de51-44a2-8db0-7e1b65098dcf")
    public static ProfileAssociationOnPortGCMInvocatingBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOnPortGCMInvocatingBehavior.canInstantiate(obj))
        	return new ProfileAssociationOnPortGCMInvocatingBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOnPortGCMInvocatingBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ffd13b4b-41c8-441c-a709-82a0dfc23d6b")
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
    @objid ("47cbdf71-0135-4e63-b85e-32501a8d35ab")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("5c2dae67-db65-455c-97d0-88913deefc8e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("badd7af6-0be3-433a-b476-1f8d2ef95bed")
    protected ProfileAssociationOnPortGCMInvocatingBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("cee2c97d-0e04-4417-9e24-fe5045961c7c")
    public static final class MdaTypes {
        @objid ("5f8317ce-efa4-4dac-8bed-bdb1ace0ad5d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c7130839-6112-43f8-ad14-2877597846ca")
        private static Stereotype MDAASSOCDEP;

        @objid ("94340117-f13f-4f12-b8da-9fc0f613b4f8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("affaf22a-1406-4a01-81dc-ff70105f6bc8")
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
