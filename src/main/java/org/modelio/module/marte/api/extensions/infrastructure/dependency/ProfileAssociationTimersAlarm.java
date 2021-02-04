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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_timers_Alarm >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1b7fe65a-6cd5-436f-b7dc-c38052d9f319")
public class ProfileAssociationTimersAlarm {
    @objid ("9a8d16d6-2d4f-455a-b450-321d2a868af2")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_timers_Alarm";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("7edb10e6-c650-4747-8d8d-1efa56a36223")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationTimersAlarm proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_timers_Alarm >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("edd43cbd-dcfd-4e02-a7ce-cb9361fc2eba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTimersAlarm.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_timers_Alarm >> then instantiate a {@link ProfileAssociationTimersAlarm} proxy.
     * 
     * @return a {@link ProfileAssociationTimersAlarm} proxy on the created {@link Dependency}.
     */
    @objid ("8ea03ede-dd65-4c0a-9929-c75943917e0e")
    public static ProfileAssociationTimersAlarm create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTimersAlarm.STEREOTYPE_NAME);
        return ProfileAssociationTimersAlarm.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTimersAlarm} proxy from a {@link Dependency} stereotyped << ProfileAssociation_timers_Alarm >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationTimersAlarm} proxy or <i>null</i>.
     */
    @objid ("d945532c-0281-43d3-b7bc-e19a6a5073fd")
    public static ProfileAssociationTimersAlarm instantiate(final Dependency obj) {
        return ProfileAssociationTimersAlarm.canInstantiate(obj) ? new ProfileAssociationTimersAlarm(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTimersAlarm} proxy from a {@link Dependency} stereotyped << ProfileAssociation_timers_Alarm >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationTimersAlarm} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f05a33c2-2000-4b42-b018-6732d84ad866")
    public static ProfileAssociationTimersAlarm safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationTimersAlarm.canInstantiate(obj))
        	return new ProfileAssociationTimersAlarm(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationTimersAlarm: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("31d9f754-db20-49eb-a121-ca6858f0bc4a")
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
        ProfileAssociationTimersAlarm other = (ProfileAssociationTimersAlarm) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("ba45125f-014a-4a53-b7e4-f6543623b6d5")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("57024cde-0b2e-46d5-9dae-45852dd6b7b0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1d5c9b9d-75b6-4f29-9193-9c7642a9e364")
    protected ProfileAssociationTimersAlarm(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("e9255b25-6e68-43eb-9eec-2626c13f08fc")
    public static final class MdaTypes {
        @objid ("63f402c5-791e-4681-94d7-36c35f814fb3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a97c61f4-f1f0-4677-8979-33589dfcd9e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("c11b9fb8-28e5-4e19-940c-e17f006a3208")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ec537dd5-af97-4286-b944-825b071a8b7e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cf9d6e99-9757-11e0-94fb-0027103f347c");
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
