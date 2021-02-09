/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.constraint.GaTimedObsConstraint;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << SaSchedObs_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaSchedObsConstraint extends GaTimedObsConstraint {
    public static final String STEREOTYPE_NAME = "SaSchedObs_Constraint";

    public static final String SASCHEDOBS_CONSTRAINT_BLOCKT_TAGTYPE = "SaSchedObs_Constraint_blockT";

    public static final String SASCHEDOBS_CONSTRAINT_OVERLAPS_TAGTYPE = "SaSchedObs_Constraint_overlaps";

    public static final String SASCHEDOBS_CONSTRAINT_SUSPENTIONS_TAGTYPE = "SaSchedObs_Constraint_suspentions";

    /**
     * Tells whether a {@link SaSchedObsConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << SaSchedObs_Constraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaSchedObsConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << SaSchedObs_Constraint >> then instantiate a {@link SaSchedObsConstraint} proxy.
     * 
     * @return a {@link SaSchedObsConstraint} proxy on the created {@link Constraint}.
     */
    public static SaSchedObsConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaSchedObsConstraint.STEREOTYPE_NAME);
        return SaSchedObsConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link SaSchedObsConstraint} proxy from a {@link Constraint} stereotyped << SaSchedObs_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link SaSchedObsConstraint} proxy or <i>null</i>.
     */
    public static SaSchedObsConstraint instantiate(final Constraint obj) {
        return SaSchedObsConstraint.canInstantiate(obj) ? new SaSchedObsConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaSchedObsConstraint} proxy from a {@link Constraint} stereotyped << SaSchedObs_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link SaSchedObsConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaSchedObsConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (SaSchedObsConstraint.canInstantiate(obj))
        	return new SaSchedObsConstraint(obj);
        else
        	throw new IllegalArgumentException("SaSchedObsConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        SaSchedObsConstraint other = (SaSchedObsConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for List<String> property 'SaSchedObs_Constraint_blockT'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSchedObs_Constraint_blockT() {
        return this.elt.getTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_BLOCKT_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSchedObs_Constraint_overlaps'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSchedObs_Constraint_overlaps() {
        return this.elt.getTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_OVERLAPS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'SaSchedObs_Constraint_suspentions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSaSchedObs_Constraint_suspentions() {
        return this.elt.getTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_SUSPENTIONS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'SaSchedObs_Constraint_blockT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSchedObs_Constraint_blockT(final List<String> values) {
        this.elt.putTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_BLOCKT_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SaSchedObs_Constraint_overlaps'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSchedObs_Constraint_overlaps(final List<String> values) {
        this.elt.putTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_OVERLAPS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'SaSchedObs_Constraint_suspentions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaSchedObs_Constraint_suspentions(final List<String> values) {
        this.elt.putTagValues(SaSchedObsConstraint.MdaTypes.SASCHEDOBS_CONSTRAINT_SUSPENTIONS_TAGTYPE_ELT, values);
    }

    protected SaSchedObsConstraint(final Constraint elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SASCHEDOBS_CONSTRAINT_SUSPENTIONS_TAGTYPE_ELT;

        public static TagType SASCHEDOBS_CONSTRAINT_BLOCKT_TAGTYPE_ELT;

        public static TagType SASCHEDOBS_CONSTRAINT_OVERLAPS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03930906-0ccf-11df-8525-001302895b2b");
            SASCHEDOBS_CONSTRAINT_SUSPENTIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03930908-0ccf-11df-8525-001302895b2b");
            SASCHEDOBS_CONSTRAINT_BLOCKT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0393090a-0ccf-11df-8525-001302895b2b");
            SASCHEDOBS_CONSTRAINT_OVERLAPS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0393090c-0ccf-11df-8525-001302895b2b");
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
