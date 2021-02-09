/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.package_;

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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.package_.GaAnalysisContextPackage;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << SaAnalysisContext_Package >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaAnalysisContextPackage extends GaAnalysisContextPackage {
    public static final String STEREOTYPE_NAME = "SaAnalysisContext_Package";

    public static final String SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE = "SaAnalysisContext_Package_isSched";

    public static final String SAANALYSISCONTEXT_PACKAGE_OPTCRITERION_TAGTYPE = "SaAnalysisContext_Package_optCriterion";

    /**
     * Tells whether a {@link SaAnalysisContextPackage proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << SaAnalysisContext_Package >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextPackage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << SaAnalysisContext_Package >> then instantiate a {@link SaAnalysisContextPackage} proxy.
     * 
     * @return a {@link SaAnalysisContextPackage} proxy on the created {@link Package}.
     */
    public static SaAnalysisContextPackage create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextPackage.STEREOTYPE_NAME);
        return SaAnalysisContextPackage.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextPackage} proxy from a {@link Package} stereotyped << SaAnalysisContext_Package >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link SaAnalysisContextPackage} proxy or <i>null</i>.
     */
    public static SaAnalysisContextPackage instantiate(final Package obj) {
        return SaAnalysisContextPackage.canInstantiate(obj) ? new SaAnalysisContextPackage(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextPackage} proxy from a {@link Package} stereotyped << SaAnalysisContext_Package >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link SaAnalysisContextPackage} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaAnalysisContextPackage safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (SaAnalysisContextPackage.canInstantiate(obj))
        	return new SaAnalysisContextPackage(obj);
        else
        	throw new IllegalArgumentException("SaAnalysisContextPackage: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaAnalysisContextPackage other = (SaAnalysisContextPackage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Getter for string property 'SaAnalysisContext_Package_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaAnalysisContext_Package_optCriterion() {
        return this.elt.getTagValue(SaAnalysisContextPackage.MdaTypes.SAANALYSISCONTEXT_PACKAGE_OPTCRITERION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaAnalysisContext_Package_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaAnalysisContext_Package_isSched() {
        return this.elt.isTagged(SaAnalysisContextPackage.MdaTypes.SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaAnalysisContext_Package_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaAnalysisContext_Package_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaAnalysisContextPackage.MdaTypes.SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaAnalysisContextPackage.MdaTypes.SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaAnalysisContext_Package_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaAnalysisContext_Package_optCriterion(final String value) {
        this.elt.putTagValue(SaAnalysisContextPackage.MdaTypes.SAANALYSISCONTEXT_PACKAGE_OPTCRITERION_TAGTYPE_ELT, value);
    }

    protected SaAnalysisContextPackage(final Package elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE_ELT;

        public static TagType SAANALYSISCONTEXT_PACKAGE_OPTCRITERION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0384bb11-0ccf-11df-8525-001302895b2b");
            SAANALYSISCONTEXT_PACKAGE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb13-0ccf-11df-8525-001302895b2b");
            SAANALYSISCONTEXT_PACKAGE_OPTCRITERION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0384bb15-0ccf-11df-8525-001302895b2b");
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
