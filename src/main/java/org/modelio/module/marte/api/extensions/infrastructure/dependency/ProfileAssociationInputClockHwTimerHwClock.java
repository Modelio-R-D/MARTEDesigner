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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_inputClock_HwTimer_HwClock >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9eda6b51-857c-416d-b304-a6f1e5d5e425")
public class ProfileAssociationInputClockHwTimerHwClock {
    @objid ("c0efdab0-7678-4615-b441-85c6d98393ef")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_inputClock_HwTimer_HwClock";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("084db3d0-25c1-4c53-ae05-99b48dae655a")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationInputClockHwTimerHwClock proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_inputClock_HwTimer_HwClock >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("651bb6ba-2174-468d-9a1c-04079a0011d5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInputClockHwTimerHwClock.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_inputClock_HwTimer_HwClock >> then instantiate a {@link ProfileAssociationInputClockHwTimerHwClock} proxy.
     * 
     * @return a {@link ProfileAssociationInputClockHwTimerHwClock} proxy on the created {@link Dependency}.
     */
    @objid ("38636d44-5eff-4000-a94d-c2ddf1613aae")
    public static ProfileAssociationInputClockHwTimerHwClock create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInputClockHwTimerHwClock.STEREOTYPE_NAME);
        return ProfileAssociationInputClockHwTimerHwClock.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInputClockHwTimerHwClock} proxy from a {@link Dependency} stereotyped << ProfileAssociation_inputClock_HwTimer_HwClock >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationInputClockHwTimerHwClock} proxy or <i>null</i>.
     */
    @objid ("05123c6f-6980-47f1-9e14-b5c8a2db64fa")
    public static ProfileAssociationInputClockHwTimerHwClock instantiate(final Dependency obj) {
        return ProfileAssociationInputClockHwTimerHwClock.canInstantiate(obj) ? new ProfileAssociationInputClockHwTimerHwClock(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInputClockHwTimerHwClock} proxy from a {@link Dependency} stereotyped << ProfileAssociation_inputClock_HwTimer_HwClock >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationInputClockHwTimerHwClock} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("84a9b9b9-f2c5-4bfe-adb6-2279b37cc5ea")
    public static ProfileAssociationInputClockHwTimerHwClock safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationInputClockHwTimerHwClock.canInstantiate(obj))
        	return new ProfileAssociationInputClockHwTimerHwClock(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationInputClockHwTimerHwClock: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0a618f8b-66cc-44fd-a8b5-da860e67c43f")
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
        ProfileAssociationInputClockHwTimerHwClock other = (ProfileAssociationInputClockHwTimerHwClock) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("36b2aed1-88f3-472b-84fc-36068f1e13c4")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("9b80891f-b359-44b5-8cba-0ea29557762b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5f2954ea-3357-453f-9619-b5100c235f0d")
    protected ProfileAssociationInputClockHwTimerHwClock(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("02673718-7491-4dcc-9665-8a9c3208653c")
    public static final class MdaTypes {
        @objid ("d3a49293-9df2-46a8-ac31-0076c8464711")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9a48724a-606e-4a58-b15d-a98024947851")
        private static Stereotype MDAASSOCDEP;

        @objid ("62d967a2-4cbf-4912-952e-f7e127187b54")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b35415ee-0d85-4231-9419-f6f741ac061f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f4f4892a-936b-11e0-b960-0027103f347c");
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
