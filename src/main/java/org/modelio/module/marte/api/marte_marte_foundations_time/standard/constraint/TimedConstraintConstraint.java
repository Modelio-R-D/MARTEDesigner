/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.module.marte.api.marte_marte_foundations_nfps.standard.constraint.NfpConstraintConstraint;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << TimedConstraint_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("40fbf25a-9939-4f8f-8d12-123d9be5912c")
public class TimedConstraintConstraint extends NfpConstraintConstraint {
    @objid ("312fbaea-ea85-4134-bbde-8a0eedb73038")
    public static final String STEREOTYPE_NAME = "TimedConstraint_Constraint";

    @objid ("7fa8e782-a81b-420b-83d7-edfe8258c5e3")
    public static final String TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION_TAGTYPE = "TimedConstraint_Constraint_interpretation";

    @objid ("e8605447-e144-4714-ac90-635b1ff6206c")
    public static final String TIMEDCONSTRAINT_CONSTRAINT_ON_TAGTYPE = "TimedConstraint_Constraint_on";

    /**
     * Tells whether a {@link TimedConstraintConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << TimedConstraint_Constraint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("77481bce-205c-4abf-93de-12c90a1f548a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedConstraintConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << TimedConstraint_Constraint >> then instantiate a {@link TimedConstraintConstraint} proxy.
     * 
     * @return a {@link TimedConstraintConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("7d07d4fa-da70-4fb6-bd20-b63a43bd882e")
    public static TimedConstraintConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedConstraintConstraint.STEREOTYPE_NAME);
        return TimedConstraintConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link TimedConstraintConstraint} proxy from a {@link Constraint} stereotyped << TimedConstraint_Constraint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link TimedConstraintConstraint} proxy or <i>null</i>.
     */
    @objid ("e4f1c5a7-fa3c-458d-97c4-41970f9b4c86")
    public static TimedConstraintConstraint instantiate(final Constraint obj) {
        return TimedConstraintConstraint.canInstantiate(obj) ? new TimedConstraintConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedConstraintConstraint} proxy from a {@link Constraint} stereotyped << TimedConstraint_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link TimedConstraintConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("246454c5-9819-4385-b837-e16b1efc82d0")
    public static TimedConstraintConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (TimedConstraintConstraint.canInstantiate(obj))
        	return new TimedConstraintConstraint(obj);
        else
        	throw new IllegalArgumentException("TimedConstraintConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8424eeef-ed10-4298-aed8-c1add46cbe77")
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
        TimedConstraintConstraint other = (TimedConstraintConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("c28af089-3e88-4212-9e8e-881dcb37a126")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'TimedConstraint_Constraint_interpretation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8be2bef-833b-4dae-b798-424a87b57fef")
    public String getTimedConstraint_Constraint_interpretation() {
        return this.elt.getTagValue(TimedConstraintConstraint.MdaTypes.TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedConstraint_Constraint_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e405aff5-a1b3-45f7-9d87-9f86bc8a8652")
    public List<String> getTimedConstraint_Constraint_on() {
        return this.elt.getTagValues(TimedConstraintConstraint.MdaTypes.TIMEDCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT);
    }

    @objid ("21dccb7b-1daa-47a9-b78a-d92681446973")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedConstraint_Constraint_interpretation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cddb3243-c044-4233-a688-c01ff753aab5")
    public void setTimedConstraint_Constraint_interpretation(final String value) {
        this.elt.putTagValue(TimedConstraintConstraint.MdaTypes.TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedConstraint_Constraint_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0e23388f-13a1-46e9-8a23-3ce7dcec885d")
    public void setTimedConstraint_Constraint_on(final List<String> values) {
        this.elt.putTagValues(TimedConstraintConstraint.MdaTypes.TIMEDCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT, values);
    }

    @objid ("9656aae4-a3b7-4ac2-99b5-ac35a94b81e0")
    protected TimedConstraintConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("8016fe68-e232-4351-b65f-74d47ff07ec3")
    public static final class MdaTypes {
        @objid ("72385705-062a-43a8-a35b-9f384b22c38b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("877bd248-013e-4ada-bf90-3c2053327ede")
        public static TagType TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION_TAGTYPE_ELT;

        @objid ("6ab4e61b-3b10-49b0-ac7c-cd1733c3161c")
        public static TagType TIMEDCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT;

        @objid ("c801d79c-de36-4d67-a8e1-68e0146fc562")
        private static Stereotype MDAASSOCDEP;

        @objid ("4db50499-e3c0-43f5-a3a5-4aa168582312")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("138aafdf-c3f1-46cc-b0f6-be076f507941")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "db3680c1-0cce-11df-8525-001302895b2b");
            TIMEDCONSTRAINT_CONSTRAINT_INTERPRETATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "db38e312-0cce-11df-8525-001302895b2b");
            TIMEDCONSTRAINT_CONSTRAINT_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2aa5ab5d-1259-11df-8f55-0014222a9f79");
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
