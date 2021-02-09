/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.class_.GaAnalysisContextClass;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << SaAnalysisContext_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaAnalysisContextClass extends GaAnalysisContextClass {
    public static final String STEREOTYPE_NAME = "SaAnalysisContext_Class";

    public static final String SAANALYSISCONTEXT_CLASS_ISSCHED_TAGTYPE = "SaAnalysisContext_Class_isSched";

    public static final String SAANALYSISCONTEXT_CLASS_OPTCRITERION_TAGTYPE = "SaAnalysisContext_Class_optCriterion";

    /**
     * Tells whether a {@link SaAnalysisContextClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SaAnalysisContext_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SaAnalysisContext_Class >> then instantiate a {@link SaAnalysisContextClass} proxy.
     * 
     * @return a {@link SaAnalysisContextClass} proxy on the created {@link Class}.
     */
    public static SaAnalysisContextClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextClass.STEREOTYPE_NAME);
        return SaAnalysisContextClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextClass} proxy from a {@link Class} stereotyped << SaAnalysisContext_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SaAnalysisContextClass} proxy or <i>null</i>.
     */
    public static SaAnalysisContextClass instantiate(final Class obj) {
        return SaAnalysisContextClass.canInstantiate(obj) ? new SaAnalysisContextClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextClass} proxy from a {@link Class} stereotyped << SaAnalysisContext_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SaAnalysisContextClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaAnalysisContextClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SaAnalysisContextClass.canInstantiate(obj))
        	return new SaAnalysisContextClass(obj);
        else
        	throw new IllegalArgumentException("SaAnalysisContextClass: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaAnalysisContextClass other = (SaAnalysisContextClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'SaAnalysisContext_Class_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaAnalysisContext_Class_optCriterion() {
        return this.elt.getTagValue(SaAnalysisContextClass.MdaTypes.SAANALYSISCONTEXT_CLASS_OPTCRITERION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaAnalysisContext_Class_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaAnalysisContext_Class_isSched() {
        return this.elt.isTagged(SaAnalysisContextClass.MdaTypes.SAANALYSISCONTEXT_CLASS_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaAnalysisContext_Class_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaAnalysisContext_Class_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaAnalysisContextClass.MdaTypes.SAANALYSISCONTEXT_CLASS_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaAnalysisContextClass.MdaTypes.SAANALYSISCONTEXT_CLASS_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaAnalysisContext_Class_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaAnalysisContext_Class_optCriterion(final String value) {
        this.elt.putTagValue(SaAnalysisContextClass.MdaTypes.SAANALYSISCONTEXT_CLASS_OPTCRITERION_TAGTYPE_ELT, value);
    }

    protected SaAnalysisContextClass(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SAANALYSISCONTEXT_CLASS_ISSCHED_TAGTYPE_ELT;

        public static TagType SAANALYSISCONTEXT_CLASS_OPTCRITERION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "83483985-14ab-11df-9d54-0014222a9f79");
            SAANALYSISCONTEXT_CLASS_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "83483986-14ab-11df-9d54-0014222a9f79");
            SAANALYSISCONTEXT_CLASS_OPTCRITERION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "83483987-14ab-11df-9d54-0014222a9f79");
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
