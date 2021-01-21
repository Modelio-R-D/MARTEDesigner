/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
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
 * Proxy class to handle a {@link Constraint} with << IntervalConstraint_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9aeb6a34-ebc0-4c57-b87a-deb86d42766c")
public class IntervalConstraintConstraint {
    @objid ("920014bf-cb30-406f-8cc8-4b11eb00671c")
    public static final String STEREOTYPE_NAME = "IntervalConstraint_Constraint";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    @objid ("b5e95246-13bc-488d-9127-1dccd04595c6")
    protected final Constraint elt;

    /**
     * Tells whether a {@link IntervalConstraintConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << IntervalConstraint_Constraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("29c51a9e-b5cd-4dcd-827a-cbfe94db2f97")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, IntervalConstraintConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << IntervalConstraint_Constraint >> then instantiate a {@link IntervalConstraintConstraint} proxy.
     * 
     * @return a {@link IntervalConstraintConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("81e33faa-7198-4d97-9633-8c0ecdd24b5f")
    public static IntervalConstraintConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, IntervalConstraintConstraint.STEREOTYPE_NAME);
        return IntervalConstraintConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link IntervalConstraintConstraint} proxy from a {@link Constraint} stereotyped << IntervalConstraint_Constraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link IntervalConstraintConstraint} proxy or <i>null</i>.
     */
    @objid ("a4ff017f-3bde-4cb2-801f-be26ee017357")
    public static IntervalConstraintConstraint instantiate(final Constraint obj) {
        return IntervalConstraintConstraint.canInstantiate(obj) ? new IntervalConstraintConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IntervalConstraintConstraint} proxy from a {@link Constraint} stereotyped << IntervalConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link IntervalConstraintConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e8e0b993-7c75-487b-aad2-ed144bef849d")
    public static IntervalConstraintConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (IntervalConstraintConstraint.canInstantiate(obj))
        	return new IntervalConstraintConstraint(obj);
        else
        	throw new IllegalArgumentException("IntervalConstraintConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a8d19f7d-6f4d-4aeb-9323-d139e3e345fb")
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
        IntervalConstraintConstraint other = (IntervalConstraintConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("adbf06de-baf6-4e87-810a-1d11161d5f67")
    public Constraint getElement() {
        return this.elt;
    }

    @objid ("902f96f2-5996-47a2-bcf4-c463939fc9ae")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fe99e911-e1ed-4ab2-9683-fea0c2f2e219")
    protected IntervalConstraintConstraint(final Constraint elt) {
        this.elt = elt;
    }

    @objid ("1c8d10ed-f78f-4530-97d8-8961ca9e6b74")
    public static final class MdaTypes {
        @objid ("1a478f5e-362c-4e3e-94f6-fa71a623b0c3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5cc34bba-002a-41a4-8d8e-0c7b627df895")
        private static Stereotype MDAASSOCDEP;

        @objid ("2f09a129-01b5-4ac4-83f1-294306311c9a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88666ee2-1449-43c2-8ca8-c81bda041c97")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f338c407-97bd-11e3-b3af-0027103f347d");
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
