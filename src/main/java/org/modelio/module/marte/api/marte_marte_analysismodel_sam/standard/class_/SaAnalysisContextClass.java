/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.class_;

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
@objid ("19e01cf0-5ce5-475b-b2a5-7949944010d8")
public class SaAnalysisContextClass extends GaAnalysisContextClass {
    @objid ("d3402097-646b-4f47-b001-8aa2c8bf24f4")
    public static final String STEREOTYPE_NAME = "SaAnalysisContext_Class";

    @objid ("db965b67-73b2-4951-a2bc-a5291c8e4877")
    public static final String SAANALYSISCONTEXT_CLASS_ISSCHED_TAGTYPE = "SaAnalysisContext_Class_isSched";

    @objid ("b3fdce71-b808-41c5-9a4e-b1497d56cf43")
    public static final String SAANALYSISCONTEXT_CLASS_OPTCRITERION_TAGTYPE = "SaAnalysisContext_Class_optCriterion";

    /**
     * Tells whether a {@link SaAnalysisContextClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SaAnalysisContext_Class >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("62262a6a-f2d2-4ea6-9696-2a91c3d9b831")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SaAnalysisContext_Class >> then instantiate a {@link SaAnalysisContextClass} proxy.
     * 
     * @return a {@link SaAnalysisContextClass} proxy on the created {@link Class}.
     */
    @objid ("de10d903-adf8-412e-8011-ad9f0e231b76")
    public static SaAnalysisContextClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaAnalysisContextClass.STEREOTYPE_NAME);
        return SaAnalysisContextClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SaAnalysisContextClass} proxy from a {@link Class} stereotyped << SaAnalysisContext_Class >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SaAnalysisContextClass} proxy or <i>null</i>.
     */
    @objid ("8a780224-afca-4a33-9bcc-81ad3bfcaad3")
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
    @objid ("7f464841-4afc-4d15-a9a5-76c2a30e26a4")
    public static SaAnalysisContextClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SaAnalysisContextClass.canInstantiate(obj))
        	return new SaAnalysisContextClass(obj);
        else
        	throw new IllegalArgumentException("SaAnalysisContextClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("01658723-c955-4c53-bc7c-f878707136b2")
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
    @objid ("d67c0482-7399-4f7f-a2c3-67564894dc94")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'SaAnalysisContext_Class_optCriterion'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e71c3cd6-5ee8-4630-bec6-fa607b3e6ff6")
    public String getSaAnalysisContext_Class_optCriterion() {
        return this.elt.getTagValue(SaAnalysisContextClass.MdaTypes.SAANALYSISCONTEXT_CLASS_OPTCRITERION_TAGTYPE_ELT);
    }

    @objid ("b7fa50c2-e472-4b59-b01b-bbdc09b52a1e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaAnalysisContext_Class_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("42838c14-68b3-4ec3-944c-03b0f17d40a9")
    public boolean isSaAnalysisContext_Class_isSched() {
        return this.elt.isTagged(SaAnalysisContextClass.MdaTypes.SAANALYSISCONTEXT_CLASS_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaAnalysisContext_Class_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("988be4d5-db54-49f8-8e56-9524bd9ea730")
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
    @objid ("66ead40d-30d6-4760-a78c-c0e9d3b3bda9")
    public void setSaAnalysisContext_Class_optCriterion(final String value) {
        this.elt.putTagValue(SaAnalysisContextClass.MdaTypes.SAANALYSISCONTEXT_CLASS_OPTCRITERION_TAGTYPE_ELT, value);
    }

    @objid ("3fe2b8b2-c575-47ca-89b5-85be8b4d2354")
    protected SaAnalysisContextClass(final Class elt) {
        super(elt);
    }

    @objid ("12ab252c-f49e-45d0-9c31-57f22497d9d9")
    public static final class MdaTypes {
        @objid ("176f2845-575e-4ab3-ba24-c0d2e8fdfcbb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b7da9eb9-6e10-4f47-98bd-e4b1197ac6dc")
        public static TagType SAANALYSISCONTEXT_CLASS_ISSCHED_TAGTYPE_ELT;

        @objid ("b17c1836-c83e-4c0a-a5c7-2414c7912db1")
        public static TagType SAANALYSISCONTEXT_CLASS_OPTCRITERION_TAGTYPE_ELT;

        @objid ("8b15d956-9c08-4b3d-adbc-9ecba6557e4e")
        private static Stereotype MDAASSOCDEP;

        @objid ("1744038e-cebf-4d9c-9969-7444c39fc1a3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("94080261-45b9-4e0c-9d8e-dcd8882480db")
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
