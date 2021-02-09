/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwCache_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwCacheClassifier extends HwMemoryClassifier {
    public static final String STEREOTYPE_NAME = "HwCache_Classifier";

    public static final String HWCACHE_CLASSIFIER_LEVEL_TAGTYPE = "HwCache_Classifier_level";

    public static final String HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE = "HwCache_Classifier_repl_Policy";

    public static final String HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE = "HwCache_Classifier_structure";

    public static final String HWCACHE_CLASSIFIER_TYPE_TAGTYPE = "HwCache_Classifier_type";

    public static final String HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE = "HwCache_Classifier_writePolicy";

    /**
     * Tells whether a {@link HwCacheClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwCache_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwCache_Classifier >> then instantiate a {@link HwCacheClassifier} proxy.
     * 
     * @return a {@link HwCacheClassifier} proxy on the created {@link Classifier}.
     */
    public static HwCacheClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCacheClassifier.STEREOTYPE_NAME);
        return HwCacheClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwCacheClassifier} proxy from a {@link Classifier} stereotyped << HwCache_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwCacheClassifier} proxy or <i>null</i>.
     */
    public static HwCacheClassifier instantiate(final Classifier obj) {
        return HwCacheClassifier.canInstantiate(obj) ? new HwCacheClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCacheClassifier} proxy from a {@link Classifier} stereotyped << HwCache_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwCacheClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwCacheClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwCacheClassifier.canInstantiate(obj))
        	return new HwCacheClassifier(obj);
        else
        	throw new IllegalArgumentException("HwCacheClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwCacheClassifier other = (HwCacheClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwCache_Classifier_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Classifier_level() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Classifier_repl_Policy() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Classifier_structure() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Classifier_type() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwCache_Classifier_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCache_Classifier_writePolicy() {
        return this.elt.getTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCache_Classifier_level'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Classifier_level(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_repl_Policy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Classifier_repl_Policy(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_structure'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Classifier_structure(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Classifier_type(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwCache_Classifier_writePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCache_Classifier_writePolicy(final String value) {
        this.elt.putTagValue(HwCacheClassifier.MdaTypes.HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT, value);
    }

    protected HwCacheClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT;

        public static TagType HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT;

        public static TagType HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT;

        public static TagType HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT;

        public static TagType HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "75e85000-1006-11df-86fe-0014222a9f79");
            HWCACHE_CLASSIFIER_LEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41af4c98-1007-11df-86fe-0014222a9f79");
            HWCACHE_CLASSIFIER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41af4c99-1007-11df-86fe-0014222a9f79");
            HWCACHE_CLASSIFIER_STRUCTURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41af4c9a-1007-11df-86fe-0014222a9f79");
            HWCACHE_CLASSIFIER_REPL_POLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41af4c9b-1007-11df-86fe-0014222a9f79");
            HWCACHE_CLASSIFIER_WRITEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "41af4c9c-1007-11df-86fe-0014222a9f79");
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
