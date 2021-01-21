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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_timers_Alarm >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1b7fe65a-6cd5-436f-b7dc-c38052d9f319")
public class ProfileAssociationTimersAlarm {
    @objid ("345db899-4137-4c75-944a-760951f21fb1")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_timers_Alarm";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("d453f7b4-d615-4f29-80a2-1a27e2d7c856")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationTimersAlarm proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_timers_Alarm >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("75b1cfe9-0b7d-4235-8472-3f522bcb2a21")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTimersAlarm.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_timers_Alarm >> then instantiate a {@link ProfileAssociationTimersAlarm} proxy.
     * 
     * @return a {@link ProfileAssociationTimersAlarm} proxy on the created {@link Dependency}.
     */
    @objid ("5954e449-0e05-4d63-a0ca-a8d9abf2371b")
    public static ProfileAssociationTimersAlarm create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTimersAlarm.STEREOTYPE_NAME);
        return ProfileAssociationTimersAlarm.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTimersAlarm} proxy from a {@link Dependency} stereotyped << ProfileAssociation_timers_Alarm >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationTimersAlarm} proxy or <i>null</i>.
     */
    @objid ("c0b56736-35b0-4098-9702-f2166a4f0154")
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
    @objid ("988ebcf2-da17-40f4-b237-09143880039e")
    public static ProfileAssociationTimersAlarm safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationTimersAlarm.canInstantiate(obj))
        	return new ProfileAssociationTimersAlarm(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationTimersAlarm: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6f8adcf8-37a3-4f60-81d2-5c8f9aa28f9f")
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
    @objid ("b5bbc906-57d3-48fc-8314-cd62512bb25c")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("5abf368b-b4fc-4f5f-a443-8aa65cf1584e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("aa6bdb9d-aa6e-4edb-a0c9-87da551ea91a")
    protected ProfileAssociationTimersAlarm(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("e9255b25-6e68-43eb-9eec-2626c13f08fc")
    public static final class MdaTypes {
        @objid ("f6221c7e-2e97-4311-b9ca-adc0dbb1d735")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("581055c0-e8e1-41ea-b759-d9d5ef19cd01")
        private static Stereotype MDAASSOCDEP;

        @objid ("1f4baf14-28e7-439b-82a3-fade9aded8a0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("733ad725-0fbb-461c-8956-0eea07e34810")
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
