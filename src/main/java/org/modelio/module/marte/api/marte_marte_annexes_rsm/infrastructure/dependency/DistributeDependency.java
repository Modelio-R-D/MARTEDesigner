/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.infrastructure.dependency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.module.marte.api.marte_marte_foundations_alloc.infrastructure.dependency.AllocateDependency;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << Distribute_Dependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class DistributeDependency extends AllocateDependency {
    public static final String STEREOTYPE_NAME = "Distribute_Dependency";

    public static final String DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE = "Distribute_Dependency_fromTiler_fitting";

    public static final String DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE = "Distribute_Dependency_fromTiler_origin";

    public static final String DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE = "Distribute_Dependency_fromTiler_paving";

    public static final String DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE = "Distribute_Dependency_patternShape";

    public static final String DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE = "Distribute_Dependency_repetitionSpace";

    public static final String DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE = "Distribute_Dependency_toTiler_fitting";

    public static final String DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE = "Distribute_Dependency_toTiler_origin";

    public static final String DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE = "Distribute_Dependency_toTiler_paving";

    /**
     * Tells whether a {@link DistributeDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << Distribute_Dependency >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DistributeDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << Distribute_Dependency >> then instantiate a {@link DistributeDependency} proxy.
     * 
     * @return a {@link DistributeDependency} proxy on the created {@link Dependency}.
     */
    public static DistributeDependency create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DistributeDependency.STEREOTYPE_NAME);
        return DistributeDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link DistributeDependency} proxy from a {@link Dependency} stereotyped << Distribute_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link DistributeDependency} proxy or <i>null</i>.
     */
    public static DistributeDependency instantiate(final Dependency obj) {
        return DistributeDependency.canInstantiate(obj) ? new DistributeDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DistributeDependency} proxy from a {@link Dependency} stereotyped << Distribute_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link DistributeDependency} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static DistributeDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (DistributeDependency.canInstantiate(obj))
        	return new DistributeDependency(obj);
        else
        	throw new IllegalArgumentException("DistributeDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        DistributeDependency other = (DistributeDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'Distribute_Dependency_fromTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDistribute_Dependency_fromTiler_fitting() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_fromTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDistribute_Dependency_fromTiler_origin() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_fromTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDistribute_Dependency_fromTiler_paving() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_patternShape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDistribute_Dependency_patternShape() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_repetitionSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDistribute_Dependency_repetitionSpace() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_toTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDistribute_Dependency_toTiler_fitting() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_toTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDistribute_Dependency_toTiler_origin() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'Distribute_Dependency_toTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getDistribute_Dependency_toTiler_paving() {
        return this.elt.getTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @Override
    public Dependency getElement() {
        return (Dependency)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'Distribute_Dependency_fromTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDistribute_Dependency_fromTiler_fitting(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_fromTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDistribute_Dependency_fromTiler_origin(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_fromTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDistribute_Dependency_fromTiler_paving(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_patternShape'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDistribute_Dependency_patternShape(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_repetitionSpace'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDistribute_Dependency_repetitionSpace(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_toTiler_fitting'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDistribute_Dependency_toTiler_fitting(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_toTiler_origin'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDistribute_Dependency_toTiler_origin(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'Distribute_Dependency_toTiler_paving'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setDistribute_Dependency_toTiler_paving(final String value) {
        this.elt.putTagValue(DistributeDependency.MdaTypes.DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT, value);
    }

    protected DistributeDependency(final Dependency elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT;

        public static TagType DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT;

        public static TagType DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT;

        public static TagType DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT;

        public static TagType DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT;

        public static TagType DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT;

        public static TagType DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT;

        public static TagType DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d5c9f4-0ccf-11df-8525-001302895b2b");
            DISTRIBUTE_DEPENDENCY_PATTERNSHAPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d5c9f6-0ccf-11df-8525-001302895b2b");
            DISTRIBUTE_DEPENDENCY_REPETITIONSPACE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d5c9f8-0ccf-11df-8525-001302895b2b");
            DISTRIBUTE_DEPENDENCY_FROMTILER_ORIGIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d5c9fa-0ccf-11df-8525-001302895b2b");
            DISTRIBUTE_DEPENDENCY_TOTILER_ORIGIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d5c9fc-0ccf-11df-8525-001302895b2b");
            DISTRIBUTE_DEPENDENCY_FROMTILER_PAVING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "42576d58-6371-433f-94ac-66fd191fcddf");
            DISTRIBUTE_DEPENDENCY_TOTILER_PAVING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "35442f11-c178-4b45-9340-0535f216d5c6");
            DISTRIBUTE_DEPENDENCY_FROMTILER_FITTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0cebe81e-69ee-402e-a3e0-dc30590cf7a7");
            DISTRIBUTE_DEPENDENCY_TOTILER_FITTING_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b0dfef64-b0b5-4d4a-9ded-3654584c54e6");
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
